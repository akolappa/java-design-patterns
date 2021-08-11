package com.creational.pattern.builder;

import java.time.LocalDate;

public class BuilderCaller {

    public static void main(String[] args) {
        User user = getUser();
        UserDTO userDTO = createDTO(UserWebDTO.getBuilder(),user);
        System.out.println(userDTO);
    }

    private static UserDTO createDTO(UserDTOBuilder builder, User user){
        return builder.withAddress(user.getAddress())
                        .withDOB(user.getDob())
                            .withFirstName(user.getFirstName())
                                .withSecondName(user.getLastName())
                                    .build();
    }

    private static User getUser(){

        User user = new User();
        Address address = new Address();

        address.setStreet("FoorthKamp");
        address.setHouseNo("52");
        address.setZip("22419");

        user.setAddress(address);
        user.setFirstName("Aravind");
        user.setLastName("Kolappapillai");
        user.setDob(LocalDate.of(1989,03,02));
        return user;
    }
}
