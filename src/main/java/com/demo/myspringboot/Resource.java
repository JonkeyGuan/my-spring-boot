package com.demo.myspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class Resource {

    @Autowired
    private GreetingService service;

    @GetMapping(path = "/greeting/{name}")
    public String inventory(@PathVariable String name) {
        return service.greeting(name);
    }

    @GetMapping
    public String hello() {
        return "Hello from Spring-boot";
    }
}
