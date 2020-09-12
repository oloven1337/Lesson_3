package com.mirea;

public class Circle extends Shape {

    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public double getArea() {
        return 3.14 * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * 3.14 * radius;
    }


    @Override
    public String toString() {
        return radius + " " + color + " " + filled;
    }
}
