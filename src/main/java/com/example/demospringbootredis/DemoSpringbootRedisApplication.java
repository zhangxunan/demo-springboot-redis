package com.example.demospringbootredis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class DemoSpringbootRedisApplication {


    public static void main(String[] args) {

        SpringApplication.run(DemoSpringbootRedisApplication.class, args);
    }
}
