package com.sandeep.learning.sfgdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello(){
        System.out.println("Hello World");
        return "Hi Folks";
    }
}
