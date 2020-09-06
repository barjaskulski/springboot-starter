package com.springboot.starter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    //
    private final HelloService helloService;

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping("/hello")                                       //----------- dodanie endpointu do serwisu
    public String hello(@RequestParam("name") String name){     //----------- dodanie interakcji z parametrem "?name=xxx" na koncu linku
        return helloService.GetHelloMsg(name);
    }
}
