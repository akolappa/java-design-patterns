package com.creational.pattern.builder;

import java.time.LocalDate;
import java.time.Period;

public class UserDTOWebBuilder implements UserDTOBuilder{

    private String firstName;
    private String secondName;
    private String address;
    private String age;

    @Override
    public UserDTOBuilder withFirstName(String name) {
        this.firstName = name;
        return this;
    }

    @Override
    public UserDTOBuilder withSecondName(String name) {
        this.secondName = name;
        return this;
    }

    @Override
    public UserDTOBuilder withAddress(Address address) {
        this.address = address.toString();
        return this;
    }

    @Override
    public UserDTOBuilder withDOB(LocalDate dob) {
        Period age = Period.between(dob, LocalDate.now());
        this.age = Integer.toString(age.getYears());
        return this;
    }

    @Override
    public UserDTO build() {
        //return new UserWebDTO(firstName+" "+secondName, address, age);
        return null;
    }
}
