package com.dsbtraining.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String home () {
        return "This is the Das Boot - Spring MVC application created using Spring Boot";
    }



}
