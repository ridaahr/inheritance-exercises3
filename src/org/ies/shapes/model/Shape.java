package org.ies.shapes.model;

import java.util.Objects;

public abstract class Shape{
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract double area();
    public abstract void info();


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Shape shape = (Shape) o;
        return Objects.equals(color, shape.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), color);
    }
}
