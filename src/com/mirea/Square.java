package com.mirea;

public class Square extends Rectangle {

    public Square() {
    }

    public Square(double side) {

    }

    public Square(double side, String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public void setSide(double side) {

    }

    public double getSide() {
        return getLength();
    }

    public void setLength(double side) {
    }

    public void setWidth(double side) {
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
