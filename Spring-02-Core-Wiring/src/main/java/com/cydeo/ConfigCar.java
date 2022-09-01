package com.cydeo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigCar {

    @Bean
    Car car() {
        Car c = new Car();
        c.setMake("Honda");
        return c;
    }

    /** Direct Wiring */
//    @Bean
//    Person person() {
//    Person person = new Person();
//    person.setName("Mike");
//    person.setCar(car());
//    return person;
//    }

    /** AutoWiring */
    @Bean
    Person person(Car car) {
        Person person = new Person();
        person.setName("Mike");
        person.setCar(car());
        return person;
    }

}

