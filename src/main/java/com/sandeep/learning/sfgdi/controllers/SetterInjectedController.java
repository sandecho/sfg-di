package com.sandeep.learning.sfgdi.controllers;

import com.sandeep.learning.sfgdi.services.GreetingService;
import com.sandeep.learning.sfgdi.services.GreetingServiceImpl;

public class SetterInjectedController {

    public GreetingService greetingService;

    public void setGreetingService(GreetingServiceImpl greetingService){
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
