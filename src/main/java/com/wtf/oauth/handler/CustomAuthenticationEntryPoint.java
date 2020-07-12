package com.wtf.oauth.handler;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wtf.oauth.common.ServerResponse;
import org.springframework.security.authentication.InsufficientAuthenticationException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Author WTF
 * @Date 2020/2/18 10:50
 * @Description 用户没有认证时统一认证
 */
@Component
public class CustomAuthenticationEntryPoint implements AuthenticationEntryPoint {
    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception) throws IOException, ServletException {
        response.setContentType("application/json;charset=utf-8");
        response.setStatus(401);
        PrintWriter out = response.getWriter();
        ServerResponse<Object> errorMessage = ServerResponse.createByErrorMessage("访问失败!");
        if (exception instanceof InsufficientAuthenticationException) {
            errorMessage = ServerResponse.createByErrorMessage("请求失败，请联系管理员!" + exception.getMessage());
        }
        out.write(new ObjectMapper().writeValueAsString(errorMessage));
        out.flush();
        out.close();
    }
}
