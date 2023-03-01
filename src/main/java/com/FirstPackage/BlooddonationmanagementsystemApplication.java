package com.FirstPackage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class BlooddonationmanagementsystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlooddonationmanagementsystemApplication.class, args);
	}

}
