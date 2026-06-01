package com.example.springapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        System.out.println();
        return "Hello, world!";
    }

    @GetMapping("/health") 
    public Health health() {
        return new Health("ok");
    }

    public record Health(String status) {
    }
}
