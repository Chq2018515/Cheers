package com.cheers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = {"com.cheers"})
@RestController
public class App {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        SpringApplication.run(App.class, args);
    }
}