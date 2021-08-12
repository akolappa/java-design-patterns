package com.creational.pattern.builder;

import java.util.Arrays;

public class BuilderCaller1 {

    public static void main(String[] args) {
        EmployeeBuilder pb = new EmployeeBuilder();
        Person aravind = pb.withName("Aravind").withOccupation("Programmer").build();

        System.out.println(aravind);
    }
}
