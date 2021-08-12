package com.creational.pattern.ocp.specification;

import java.util.List;

public class ColorSpecification implements Specification<Product> {

    Color color;

    public ColorSpecification(Color color) {
        this.color = color;
    }

    @Override
    public Boolean isSatisfied(Product product) {
        return this.color.equals(product.getColor());
    }
}
