package com.example.autowrite.type;


public class Car {

    private Specification specification;

    public void setSpecification(Specification specification) {
        this.specification = specification;
    }

    public void displayDetails(){
        System.out.println("Car details: " +specification.toString());
    }
}
