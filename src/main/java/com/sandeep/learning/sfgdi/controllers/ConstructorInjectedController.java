package com.sandeep.learning.sfgdi.controllers;

import com.sandeep.learning.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller

public class ConstructorInjectedController {

    private final GreetingService greetingService;


    public ConstructorInjectedController(@Qualifier("constructorInjectedGreetingServiceImpl")GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
