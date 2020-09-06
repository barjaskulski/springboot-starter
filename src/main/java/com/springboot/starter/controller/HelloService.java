package com.springboot.starter.controller;

import org.springframework.stereotype.Component;

@Component
public class HelloService {
    public String GetHelloMsg (){
        return "<h2>Hello World!</h2>";
    }
}
