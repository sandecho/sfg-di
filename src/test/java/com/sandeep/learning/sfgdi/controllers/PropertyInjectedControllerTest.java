package com.sandeep.learning.sfgdi.controllers;

import com.sandeep.learning.sfgdi.services.PropertyInjectedGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();

        controller.greetingService = new PropertyInjectedGreetingServiceImpl();
    }

    @Test
    void getGreetings(){
        System.out.println(controller.getGreeting());
    }
}

