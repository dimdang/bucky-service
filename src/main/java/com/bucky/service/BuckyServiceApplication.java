package com.bucky.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.bucky"})
public class BuckyServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BuckyServiceApplication.class, args);
	}
}
