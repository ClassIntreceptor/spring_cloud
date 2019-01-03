package com.cloud.controlcenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;


@SpringBootApplication//启动类
@EnableConfigServer//配置中心服务端
public class ConfigServer38001Application {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServer38001Application.class, args);
    }

}

