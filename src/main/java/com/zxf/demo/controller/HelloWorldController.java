package com.zxf.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloWorldController {
    @RequestMapping(value = "/helloworld",method = RequestMethod.GET)
    public String hello(){
        return "hello springboot";
    }
}