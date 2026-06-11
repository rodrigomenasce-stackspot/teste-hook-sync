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

//demo-c6cfdcc6

//demo-0c7ecfac

//demo-2552d6e2

//demo-eaa212ff

//demo-6c64b071

//demo-6c16f1d8

//demo-d0cce7da

//demo-de5dc5bb

//demo-22e1f653

//demo-b3893169

//demo-cdcf9a48

//demo-abf4d1a2

//demo-94a48eb8

//demo-9fe50b0c

//demo-0b73c29b

//demo-b8f057c8
