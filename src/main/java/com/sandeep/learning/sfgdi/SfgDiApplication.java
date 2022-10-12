package com.sandeep.learning.sfgdi;

import com.sandeep.learning.sfgdi.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);

        MyController controller = (MyController) context.getBean("myController");

        String greetings = controller.sayHello();

        System.out.println(greetings);

    }

}
