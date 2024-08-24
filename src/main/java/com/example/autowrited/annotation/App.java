package com.example.autowrited.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Employee employee = (Employee) context.getBean("employee");
        System.out.println("hihihi");
        System.out.println(employee.toString());

        Manager manager = (Manager) context.getBean("manager");
        System.out.println("hihihi manager");
        System.out.println(manager.toString());
    }
}
