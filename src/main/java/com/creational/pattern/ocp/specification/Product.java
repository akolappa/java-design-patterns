package com.creational.pattern.ocp.specification;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Product {

    private String name;
    private Size size;
    private Color color;

    public Product(String name, Size size, Color color) {
        this.name = name;
        this.size = size;
        this.color = color;
    }
}
