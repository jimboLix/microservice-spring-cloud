package com.jimbo.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaSpringCloudApplication {
	public static void main(String[] args) {
		SpringApplication.run(EurekaSpringCloudApplication.class, args);
	}
}
