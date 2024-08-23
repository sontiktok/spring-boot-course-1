package com.example.autowrite.type;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context
                = new ClassPathXmlApplicationContext("autowireByType.xml");
        Car myCar = (Car) context.getBean("myCar");
        System.out.println("Check autowireByType");
        myCar.displayDetails();

    }
}
