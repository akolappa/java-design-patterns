package com.creational.pattern.ocp.specification;

import java.util.List;
import java.util.stream.Stream;

public class ConcreteFilter implements Filter<Product>{

    @Override
    public Stream<Product> filter(List<Product> items ,Specification<Product> specification) {
        return items.stream().filter(specification::isSatisfied);
    }
}
