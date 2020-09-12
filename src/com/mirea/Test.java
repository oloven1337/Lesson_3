package com.mirea;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Test {
    public static void main(String[] args) {
        Shape shape = new Circle(5.5, "RED", false);
        System.out.println(shape);
        System.out.println(shape.getArea());
        System.out.println(shape.getPerimeter());
        System.out.println(shape.getColor());
        System.out.println(shape.isFilled());
        //   System.out.println(shape.getRadius); нельзя вызвать этот метод, так как мы создаем объект
        //   по образцу класса Shape (от родителя).

        Circle circle = (Circle) shape;
        System.out.println(circle);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getColor());
        System.out.println(circle.isFilled());
        System.out.println(circle.getRadius());

        Shape shape2 = new Shape() {
            @Override
            public double getArea() {
                return 0;
            }

            @Override
            public double getPerimeter() {
                return 0;
            }

            @Override
            public String toString() {
                return null;
            }
        };

        Shape shape3 = new Rectangle(1.0, 2.0, "RED", false);
        System.out.println(shape3);
        System.out.println(shape.getArea());
        System.out.println(shape3.getPerimeter());
        System.out.println(shape3.getColor());
        // System.out.println(shape3.getLength);
        // нельзя вызвать этот метод, так как мы создаем объект
        //   по образцу класса Shape (от родителя).

        Rectangle rectangle = (Rectangle) shape3;
        System.out.println(rectangle);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getColor());
        System.out.println(rectangle.getLength());

        Shape shape4 = new Square(6.6);
        System.out.println(shape4);
        System.out.println(shape4.getArea());
        System.out.println(shape4.getColor());
        // System.out.println(shape4.getSide()); та же проблема, как и в прошлых

        Rectangle rectangle2 = (Rectangle) shape4;
        System.out.println(rectangle);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getColor());
        System.out.println(rectangle.getLength());

        Square square = (Square) rectangle2;
        System.out.println(square);
        System.out.println(rectangle);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getColor());
        System.out.println(rectangle.getLength());
    }

}
