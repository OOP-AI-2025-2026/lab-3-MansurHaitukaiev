package org.example.task2;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        setLength(length);
        setWidth(width);
        setHeight(height);
    }

    private void setLength(double length) throws IllegalArgumentException {
        if (length <= 0) {
            throw new IllegalArgumentException("Довжина повинна бути більшою за 0");
        }
        this.length = length;
    }

    private void setWidth(double width) throws IllegalArgumentException {
        if (width <= 0) {
            throw new IllegalArgumentException("Ширина повинна бути більшою за 0");
        }
        this.width = width;
    }

    private void setHeight(double height) throws IllegalArgumentException {
        if (height <= 0) {
            throw new IllegalArgumentException("Висота повинна бути більшою за 0");
        }
        this.height = height;
    }

    public double getLength() {
        return this.length;
    }

    public double getHeight() {
        return this.height;
    }

    public double getWidth() {
        return this.width;
    }

    public double surfaceArea() {
        return 2 * (length * width + length * height + width * height);
    }

    public double lateralSurfaceArea() {
        return 2 * height * (length + width);
    }

    public double volume() {
        return length * width * height;
    }
}