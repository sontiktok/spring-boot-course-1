package com.example.autowrite.name;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context
                = new ClassPathXmlApplicationContext("autowireByName.xml");
        Car myCar = (Car) context.getBean("myCar");
        System.out.println("Check");
        myCar.displayDetails();

    }
}
