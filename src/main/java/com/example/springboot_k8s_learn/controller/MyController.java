package com.example.springboot_k8s_learn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/greet")
    public String greet() {
        return "Welcome to kubernetes..";
    }
}
