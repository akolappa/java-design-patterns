package com.creational.pattern.bridge;

public class BridgePattern {

    public static void main(String[] args) {
        String toString = new Square(new PixelRenderer()).toString();
        System.out.println(toString);
    }
}

interface Shape {
    String getName();
}

class Square implements Shape{

    private Renderer renderer;

    public Square(Renderer renderer) {
        this.renderer = renderer;
    }

    @Override
    public String getName() {
        return "Square";
    }

    @Override
    public String toString() {
        return "Square rendered as " + renderer.whatToRenderAs();
    }
}

class Triangle implements Shape{

    private Renderer renderer;

    public Triangle(Renderer renderer) {
        this.renderer = renderer;
    }

    @Override
    public String getName() {
        return "Triangle";
    }

    @Override
    public String toString() {
        return "Triangle rendered as " + renderer.whatToRenderAs();
    }
}

interface Renderer {
    String whatToRenderAs();
}

class VectorRenderer implements Renderer{
    @Override
    public String whatToRenderAs() {
        return "lines";
    }
}

class PixelRenderer implements Renderer{
    @Override
    public String whatToRenderAs() {
        return "pixels";
    }
}