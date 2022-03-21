package com.javainuse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootHelloWorldApplication {

	public static void main(String[] args) {

		SpringApplication.run(
			SpringBootHelloWorldApplication.class , args);
	}
}

// http://localhost:8080/javainuse-rabbitmq/producer?empName=Bibhuti&empId=01