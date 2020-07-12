package com.wtf.oauth.handler;

import com.wtf.oauth.model.dto.UmsPermissionDTO;
import com.wtf.oauth.po.UmsRole;
import com.wtf.oauth.service.UmsPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.stereotype.Component;
import org.springframework.util.AntPathMatcher;

import java.util.Collection;
import java.util.List;

/**
 * @Author WTF
 * @Date 2020/2/18 11:23
 * @Description 主要是根据用户传来的请求地址，获取请求需要的角色
 */
@Component
public class CustomFilterInvocationSecurityMetadataSource implements FilterInvocationSecurityMetadataSource {

    @Autowired
    private UmsPermissionService umsPermissionService;

    private AntPathMatcher antPathMatcher = new AntPathMatcher();

    @Override
    public Collection<ConfigAttribute> getAttributes(Object object) throws IllegalArgumentException {
        String requestUrl = ((FilterInvocation) object).getRequestUrl();
        List<UmsPermissionDTO> permissions = umsPermissionService.getPermissionsWithRole();
        for (UmsPermissionDTO perm : permissions) {
            if (antPathMatcher.match(perm.getUrl(), requestUrl)) {
                List<UmsRole> roles = perm.getRoles();
                String[] str = new String[roles.size()];
                for (int i = 0; i < roles.size(); i++) {
                    str[i] = roles.get(i).getName();
                }
//                System.err.println(str);
                return SecurityConfig.createList(str);
            }
        }
//        permissions.stream().filter(perm -> antPathMatcher.match(perm.getUrl(), requestUrl))
//                .map(perm ->  perm.getRoles().stream().map(role -> role.getName())).collect(Collectors.toList()).toArray(new String[0]);
//        if (roleNames != null && roleNames.length > 0) {
//            return SecurityConfig.createList(roleNames);
//        }
        return SecurityConfig.createList("ROLE_LOGIN");
    }

    @Override
    public Collection<ConfigAttribute> getAllConfigAttributes() {
        return null;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return true;
    }
}
