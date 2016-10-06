package com.tneciv.dockerboot;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication
@MapperScan("com.tneciv.dockerboot.dao")
public class DockerBootApplication {
    Logger logger = LoggerFactory.getLogger(DockerBootApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(DockerBootApplication.class, args);
    }

}
