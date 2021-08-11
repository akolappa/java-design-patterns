package com.creational.pattern.builder;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class User {

    private String firstName;
    private String lastName;
    private Address address;
    private LocalDate dob;
}
