package com.cydeo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DealerApp {

    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigCar.class);

        Car c = container.getBean(Car.class);
        Person p = container.getBean(Person.class);

        System.out.println("Person name = " + p.getName());
        System.out.println("Car make = " + c.getMake());
        System.out.println("Get Person Car = " + p.getCar().getMake());


    }
}
