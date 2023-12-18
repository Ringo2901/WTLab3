package com.es.phoneshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.es.phoneshop.web", "com.es.core"})
public class MainWebApplicationClass {
    public static void main(String[] args) {
        SpringApplication.run(MainWebApplicationClass.class, args);
    }
}
