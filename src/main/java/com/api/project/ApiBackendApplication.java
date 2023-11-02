package com.api.project;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.api.project.mapper")
public class ApiBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiBackendApplication.class, args);
    }

}
