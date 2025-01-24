package org.ies.shapes.model;

import java.util.Objects;

public class Triangle extends Shape {
    protected double base;
    protected double height;

    public Triangle(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return (base*height)/2;
    }

    @Override
    public void info() {
        System.out.println("Base: " + base + ". Altura: " + height + ". área: " + area());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(base, triangle.base) == 0 && Double.compare(height, triangle.height) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(base, height);
    }
}
