package com.cloud.controlcenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer//注册中心
public class RegistryserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(RegistryserverApplication.class, args);
    }

}

