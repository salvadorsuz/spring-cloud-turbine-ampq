package com.in28minutes.microservices.springcloudturbineampq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.turbine.stream.EnableTurbineStream;

@SpringBootApplication
@EnableEurekaClient
@EnableTurbineStream
public class SpringCloudTurbineAmqpApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudTurbineAmqpApplication.class, args);
	}
}
