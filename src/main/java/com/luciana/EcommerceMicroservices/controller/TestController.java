package com.luciana.EcommerceMicroservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/hola")
    public String saludar() {
        return "¡Hola! Mi primer microservicio de E-commerce";
    }
}