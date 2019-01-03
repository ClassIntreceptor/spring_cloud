package com.ryan.cloud.registryserver37002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Registryserver37002Application {

	public static void main(String[] args) {
		SpringApplication.run(Registryserver37002Application.class, args);
	}

}

