package com.creational.pattern.ocp.specification;

public class ORSpecification implements Specification<Product>{
    Specification<Product> s1;
    Specification<Product> s2;

    public ORSpecification(Specification<Product> s1, Specification<Product> s2) {
        this.s1 = s1;
        this.s2 = s2;
    }

    @Override
    public Boolean isSatisfied(Product product){
        return s1.isSatisfied(product) || s2.isSatisfied(product);
    }
}
