package com.example.wiremock_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DigitalWalletController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }
}
