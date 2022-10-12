package com.sandeep.learning.sfgdi;

import com.sandeep.learning.sfgdi.controllers.ConstructorInjectedController;
import com.sandeep.learning.sfgdi.controllers.MyController;
import com.sandeep.learning.sfgdi.controllers.PropertyInjectedController;
import com.sandeep.learning.sfgdi.controllers.SetterInjectedController;
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

        System.out.println("---------------- Property");

        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) context.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());


        System.out.println("---------------- Setter");

        SetterInjectedController setterInjectedController =(SetterInjectedController) context.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreeting());

        System.out.println("---------------- Constructor");

        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) context.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreeting());

    }

}
