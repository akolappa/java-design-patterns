package com.creational.pattern.builder;

import lombok.ToString;

import java.time.LocalDate;
import java.time.Period;

@ToString
public class UserWebDTO implements UserDTO{

    private String name;
    private String address;
    private String age;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public String getAge() {
        return age;
    }

    public static UserDTOBuilder getBuilder(){
        return new UserDTOInnerBuilder();
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setAddress(String address) {
        this.address = address;
    }

    private void setAge(String age) {
        this.age = age;
    }

    public static class UserDTOInnerBuilder implements UserDTOBuilder{
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
            UserWebDTO userWebDTO = new UserWebDTO();
            userWebDTO.setAddress(address);
            userWebDTO.setAge(age);
            userWebDTO.setName(firstName+" "+secondName);
            return userWebDTO;
        }

    }
}
