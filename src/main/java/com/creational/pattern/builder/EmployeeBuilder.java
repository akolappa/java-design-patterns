package com.creational.pattern.builder;

public class EmployeeBuilder extends PersonBuilder<EmployeeBuilder>{


    public EmployeeBuilder withOccupation(String occupation){
        person.occupation = occupation;
        return this;
    }

    @Override
    protected EmployeeBuilder self() {
        return this;
    }
}
