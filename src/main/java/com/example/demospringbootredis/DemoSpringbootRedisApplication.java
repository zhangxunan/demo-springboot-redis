package com.example.demospringbootredis;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;

@SpringBootApplication
@EnableAutoConfiguration
public class DemoSpringbootRedisApplication {


    @Autowired
    private Environment env;

    @Bean(destroyMethod = "shutdown")
    public RedissonClient redissonClient() throws IOException {
        String[] profiles = env.getActiveProfiles();
        String profile = "";
        if (profiles.length > 0) {
            profile = "-" + profiles[0];
        }
        RedissonClient client = Redisson.create(
                Config.fromYAML(new ClassPathResource("redisson" + profile + ".yml").getInputStream())
        );
        return client;
    }

    public static void main(String[] args) {

        SpringApplication.run(DemoSpringbootRedisApplication.class, args);
    }
}
