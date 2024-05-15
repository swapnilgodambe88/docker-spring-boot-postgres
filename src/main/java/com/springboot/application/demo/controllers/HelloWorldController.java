package com.springboot.application.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Swapnil Godambe.<br>
 * Copyright 2024.
 */
@RestController
public class HelloWorldController {

    @GetMapping(path = "/greeting/", produces = "application/json")
    public String helloWorld(){
        return "Hello World!!";
    }
}
