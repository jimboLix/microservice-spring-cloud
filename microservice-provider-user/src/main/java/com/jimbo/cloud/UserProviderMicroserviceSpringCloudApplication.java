package com.jimbo.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class UserProviderMicroserviceSpringCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserProviderMicroserviceSpringCloudApplication.class, args);
	}
}
