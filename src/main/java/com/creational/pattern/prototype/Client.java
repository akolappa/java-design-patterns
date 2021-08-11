package com.creational.pattern.prototype;

import javax.imageio.spi.RegisterableService;

public class Client {

    public static void main(String[] args) throws Exception {

        SwordMan s1 = new SwordMan();
        s1.attack();
        s1.move(23,34);
        System.out.println(s1.getPosition().getX()+"   "+ s1.getPosition().getY());

        SwordMan s2 = (SwordMan) s1.clone();
        s2.move(34,45);
        System.out.println(s2.getPosition().getX()+"   "+ s2.getPosition().getY());
        SwordMan s3 = (SwordMan) s2.clone();
        System.out.println(s2.getPosition().getX()+"   "+ s2.getPosition().getY());

        General general = new General();

        System.out.println(general.getPosition().getX()+"   "+ general.getPosition().getY());
        GameUnit clone = general.clone();

    }
}
