package com.wtf.oauth.handler;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wtf.oauth.common.ServerResponse;
import com.wtf.oauth.po.UmsUser;
import org.springframework.beans.BeanUtils;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Author WTF
 * @Date 2020/2/18 10:36
 * @Description 登录成功回调
 */
@Component
public class CustomAuthenticationSuccessHandler implements AuthenticationSuccessHandler {
    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        response.setContentType("application/json;charset=utf-8");
        PrintWriter out = response.getWriter();
        UmsUser user = new UmsUser();//(UmsUser) authentication.getPrincipal();
        BeanUtils.copyProperties(authentication.getPrincipal(), user);
        user.setPassword(null);
        ServerResponse<UmsUser> success = ServerResponse.createBySuccess("登录成功！", user);
        String s = new ObjectMapper().writeValueAsString(success);
        out.write(s);
        out.flush();
        out.close();
    }
}
