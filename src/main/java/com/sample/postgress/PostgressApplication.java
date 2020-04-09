package com.sample.postgress;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication(scanBasePackages="com.sample")

public class PostgressApplication {

	public static void main(String[] args) {
		SpringApplication.run(PostgressApplication.class, args);
	}

}

