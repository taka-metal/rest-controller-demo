package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RestDemoController {

    @GetMapping("/greeting")
    public String getGreeting() {
        return "Hello, World!";
    }
}
