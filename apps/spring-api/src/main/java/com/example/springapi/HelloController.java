package com.example.springapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello(@RequestParam(value = "name", defaultValue = "world") String name) {
        return "Hello, " + name + "!";
    }

    @GetMapping("/health")
    public Health health() {
        return new Health("ok");
    }

    public record Health(String status) {}
}
