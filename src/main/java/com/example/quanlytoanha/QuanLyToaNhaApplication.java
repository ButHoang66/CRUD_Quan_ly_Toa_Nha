package com.example.quanlytoanha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class QuanLyToaNhaApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuanLyToaNhaApplication.class, args);
    }

}
