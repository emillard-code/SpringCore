package com.project;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main( String[] args ) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        // Annotation-based configuration (+ XML configuration for tire dependency)
        Vehicle obj = (Vehicle) context.getBean("car");
        obj.drive();

        // XML-based configuration
        Tire tire = (Tire) context.getBean("tire");
        System.out.println(tire);

    }

}
