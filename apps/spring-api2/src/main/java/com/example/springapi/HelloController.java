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

// demo-7b6f1f47

// demo-be558e9d

// demo-6112ab5a

// demo-8f259dc6

//demo-ebca161c

//demo-91568261

//demo-1c18a737

//demo-f49c5d55

//demo-25782a58
