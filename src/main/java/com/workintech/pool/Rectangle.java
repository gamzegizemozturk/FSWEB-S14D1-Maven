package com.workintech.pool;

public class Rectangle {
    private double width;
    private double length;

    // Constructor metodu
    public Rectangle(double width, double length) {
        this.width = (width < 0) ? 0 : width;
        this.length = (length < 0) ? 0 : length;
    }

    // getWidth metodu
    public double getWidth() {
        return width;
    }

    // getLength metodu
    public double getLength() {
        return length;
    }

    // getArea metodu
    public double getArea() {
        return width * length;
    }
}