package com.workintech.pool;

public class Cuboid extends Rectangle {
    private double height;

    // Constructor metodu
    public Cuboid(double width, double length, double height) {
        super(width, length);
        this.height = (height < 0) ? 0 : height;
    }

    // getHeight metodu
    public double getHeight() {
        return height;
    }

    // getVolume metodu
    public double getVolume() {
        return getArea() * height;
    }
}