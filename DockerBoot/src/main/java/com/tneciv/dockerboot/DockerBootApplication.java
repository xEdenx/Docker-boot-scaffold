package com.tneciv.dockerboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableAutoConfiguration
@EnableCaching
@SpringBootApplication
@MapperScan("com.tneciv.dockerboot.mapper")
public class DockerBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockerBootApplication.class, args);
    }

}
