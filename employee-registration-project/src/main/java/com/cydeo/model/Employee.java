package com.cydeo.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {

    private String firstName;
    private String lastName;
    private String birthday;
    private String email;
    private String password;
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String zipCode;
}
