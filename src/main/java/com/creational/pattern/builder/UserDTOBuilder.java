package com.creational.pattern.builder;

import java.time.LocalDate;

public interface UserDTOBuilder {

    UserDTOBuilder withFirstName(String name);
    UserDTOBuilder withSecondName(String name);
    UserDTOBuilder withAddress(Address address);
    UserDTOBuilder withDOB(LocalDate dob);

    UserDTO build();
}
