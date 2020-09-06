package com.springboot.starter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    //
    private HelloService helloService;

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping("/hello") //----------------------- dodanie endpointu do serwisu
    public String hello(){
        return helloService.GetHelloMsg();
    }
}
