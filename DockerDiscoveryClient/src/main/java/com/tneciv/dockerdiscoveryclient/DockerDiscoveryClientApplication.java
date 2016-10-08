package com.tneciv.dockerdiscoveryclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class DockerDiscoveryClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerDiscoveryClientApplication.class, args);
	}
	
}
