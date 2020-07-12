package com.wtf.oauth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"com.wtf.oauth.mapper"})
public class ElkOauthApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElkOauthApplication.class, args);
    }

}
