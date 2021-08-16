package com.creational.pattern.decorator;

import java.util.Arrays;
import java.util.function.Supplier;

public class DecoraterStatic {

    public static void main(String[] args) {
        Shape transparentShape = new TransparentShape<>(new Square(10), "35");
        System.out.println(transparentShape.info());
        //transparentShape.getShape().refactor(12);
       // System.out.println(transparentShape.info());

    }
}

interface Shape {
    String info();
}

class Circle implements Shape{
    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public String info() {
        return "This is a circle with radius " + radius;
    }

    public void refactor(float factor){
        this.radius *= factor;
    }
}

class Square implements Shape{
    private float side;

    public Square(float side) {
        this.side = side;
    }

    @Override
    public String info() {
        return "This is a Square with side " + side;
    }

    public void refactor(float factor){
        this.side += factor;
    }
}

class TransparentShape<T extends Shape> implements Shape {

    private T shape;
    private String transparency;

    public TransparentShape (T constr, String transparency){
        this.transparency = transparency;
        this.shape = constr;
    }

    @Override
    public String info() {
        return shape.info() + "has a transparency of " +transparency+ "%";
    }

    public T getShape() {
        return shape;
    }
}

class ColoredShape<T extends Shape> implements Shape {

    private T shape;
    private String color;

    public ColoredShape (Supplier<? extends T> constr, String color){
        this.shape = constr.get();
        this.color = color;
    }

    @Override
    public String info() {
        return shape.info() + "has a color of " + color;
    }
}