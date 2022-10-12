package com.sandeep.learning.sfgdi.controllers;

import com.sandeep.learning.sfgdi.services.GreetingService;
import com.sandeep.learning.sfgdi.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    public GreetingService greetingService;

    @Autowired
    public void setGreetingService(GreetingServiceImpl greetingService){
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
