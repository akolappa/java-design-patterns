package com.creational.pattern.ocp.specification;

import java.util.List;

public class Caller {

    public static void main(String[] args) {
        Product blueMedium = new Product("blueMedium",Size.MEDIUM,Color.BLUE);
        Product blueLarge = new Product("blueLarge",Size.LARGE,Color.BLUE);
        Product yellowMedium = new Product("yellowMedium",Size.MEDIUM,Color.YELLOW);
        Product blackLarge = new Product("blackLarge",Size.LARGE,Color.BLACK);

        List<Product> products = List.of(blueLarge,blackLarge,blueMedium,yellowMedium);

        ConcreteFilter concreteFilter = new ConcreteFilter();

        concreteFilter.filter(products,
                                    new SizeSpecification(Size.LARGE))
        .forEach(System.out::println);

        concreteFilter.filter(products,
                                    new ORSpecification(new ColorSpecification(Color.BLUE),
                                                         new SizeSpecification(Size.MEDIUM)))
        .forEach(System.out::println);

    }
}
