package com.tneciv.dockereureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DockerEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockerEurekaApplication.class, args);
    }
    
}
