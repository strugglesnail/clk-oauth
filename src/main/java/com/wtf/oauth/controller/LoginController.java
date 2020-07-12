package com.wtf.oauth.controller;

import com.wtf.oauth.common.ServerResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author WTF
 * @Date 2020/2/18 16:40
 * @Description
 */
@RestController
@RequestMapping("/sysr")
public class LoginController {

    @PostMapping("/login")
    public ServerResponse login(String username, String password) {
        return ServerResponse.createBySuccess();
    }
}
