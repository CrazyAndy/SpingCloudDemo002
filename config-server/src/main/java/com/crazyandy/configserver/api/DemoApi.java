package com.crazyandy.configserver.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoApi {
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
