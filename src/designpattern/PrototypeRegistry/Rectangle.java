package designpattern.PrototypeRegistry;

import java.awt.*;

public class Rectangle implements Shape {
    private int length;
    private int width;
    private String color;

    public Rectangle(int length, int width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }

    public Rectangle(Rectangle rectangle) {
        this.length = rectangle.length;
        this.width = rectangle.width;
        this.color = rectangle.color;
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle with - (lenght, witdh, color) : " + this.length + " " + this.width + " " + this.color);
    }
}
