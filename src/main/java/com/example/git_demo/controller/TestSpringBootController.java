package com.example.git_demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/test")
public class TestSpringBootController {

    @RequestMapping("/spring")
    public String hello(){
        return "SpringBoot SUCCESS!";
    }
}
