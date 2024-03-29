package com.example.jan2023.controller;

import org.springframework.web.bind.annotation.*;

@RestController//this is controller
@RequestMapping("/hello")
public class HelloController {

    //this is method
    @GetMapping("/greet")
    public String sayHello() {
        return "WELCOME TO THE SPRINGBOOT FRAMEWORK";

    }
    @GetMapping("/greet/{name}")
    public String sayHelloWithName(@PathVariable("name") String inputName){
        return "Hi "+inputName+" , Welcome to spring framework";
    }
    @GetMapping("/greeting")
    public String sayHelloWithRequestParam(@RequestParam("name") String inputName){
        return "Hi "+inputName+" , Welcome to spring framework - Request Param";
    }
}
