package com.example.taco;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.example.repo")
@SpringBootApplication
@ComponentScan(basePackages = {"com.example.controller", "com.example.repo", "com.example.model"})
@EntityScan("com.example.*")
public class RestfulApiDb2Application {

	public static void main(String[] args) {
		SpringApplication.run(RestfulApiDb2Application.class, args);
	}

}
