package com.cloud.controlcenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer//注册中心
public class Registryserver37001Application {

    public static void main(String[] args) {
        SpringApplication.run(Registryserver37001Application.class, args);
    }

}

