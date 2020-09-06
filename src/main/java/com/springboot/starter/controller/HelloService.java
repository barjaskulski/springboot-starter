package com.springboot.starter.controller;

import org.springframework.stereotype.Component;

@Component
public class HelloService {
    public String GetHelloMsg (String name){
        return "<h2>Hello "+name+"!</h2>";
    }
}
