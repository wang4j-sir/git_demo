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

    public static void main(String[] args) {
        System.out.println("111111");
        System.out.println("22221111");
        System.out.println("mac----");
    }


}
