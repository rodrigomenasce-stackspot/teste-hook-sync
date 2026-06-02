package com.example.springapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Hello, world!";
    }

    @GetMapping("/health") 
    public Health health() {
        System.out.println();
        return new Health("ok"); 
    }

    public record Health(String status) {
    }
}

// demo-c34c8d0d
