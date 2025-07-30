package designpattern.PrototypeRegistry;

import java.awt.*;

public class Circle implements Shape {
    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // Copy constructor
    public Circle(Circle circle) {
        this.radius = circle.radius;
        this.color = circle.color;
    }

    @Override
    public Shape clone() {
        return new Circle(this); // deep copy
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle with color " + color + " and with radius " + radius);
    }
}
