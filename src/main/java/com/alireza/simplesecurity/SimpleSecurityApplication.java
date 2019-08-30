package com.alireza.simplesecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class SimpleSecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleSecurityApplication.class, args);
    }

}
