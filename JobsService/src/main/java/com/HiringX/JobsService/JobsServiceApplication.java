package com.HiringX.JobsService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
public class JobsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(JobsServiceApplication.class, args);
	}

}
