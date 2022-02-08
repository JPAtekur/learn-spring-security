package com.learn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping
    public String get(){
        return "Hello Spring Security";
    }

    @GetMapping("/home")
    public String home(){
        return "From Home";
    }

    @PostMapping("/insert")
    public String insert(){
        return "Insert";
    }
}
