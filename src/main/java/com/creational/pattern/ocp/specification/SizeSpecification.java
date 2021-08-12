package com.creational.pattern.ocp.specification;

import java.util.List;

public class SizeSpecification implements Specification<Product>{

    Size size;

    public SizeSpecification(Size size) {
        this.size = size;
    }

    @Override
    public Boolean isSatisfied(Product product) {
        return this.size.equals(product.getSize());
    }
}
