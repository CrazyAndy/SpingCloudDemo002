package com.ntimes.configclientservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ConfigClientServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientServiceApplication.class, args);
	}
}
