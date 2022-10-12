package com.sandeep.learning.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorInjectedGreetingServiceImpl implements  GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello World --COnstructor";
    }
}
