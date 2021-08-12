package com.creational.pattern.ocp.specification;

import java.util.List;
import java.util.stream.Stream;

public interface Specification<T> {

    Boolean isSatisfied(T item);
}
