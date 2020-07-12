package com.wtf.oauth.service.impl;

import com.wtf.oauth.po.UmsPermission;
import com.wtf.oauth.po.UmsUser;
import com.wtf.oauth.service.UmsUserService;
import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @Author WTF
 * @Date 2020/2/13 20:10
 * @Description 自定义认证和授权
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UmsUserService umsUserService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UmsUser user = umsUserService.getUserByName(username);
        List<GrantedAuthority> grantedAuthorities = Lists.newArrayList();
        if (user != null) {
            List<UmsPermission> permissions = umsUserService.getPermissionsByUserId(1L);
            permissions.stream().forEach(umsPermission -> {
                if (!StringUtils.isEmpty(umsPermission.getEnname())) {
                    GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(umsPermission.getEnname());
                    grantedAuthorities.add(grantedAuthority);
                }
            });
        }
        return new User(user.getUsername(), user.getPassword(), grantedAuthorities);
    }
}
