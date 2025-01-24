package org.ies.shapes.model;

import java.util.Objects;

public class Draw {
    protected double x;
    protected double y;
    protected Shape shape;

    public Draw(double x, double y, Shape shape) {
        this.x = x;
        this.y = y;
        this.shape = shape;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Draw draw = (Draw) o;
        return Double.compare(x, draw.x) == 0 && Double.compare(y, draw.y) == 0 && Objects.equals(shape, draw.shape);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, shape);
    }

    @Override
    public String toString() {
        return "Draw{" +
                "x=" + x +
                ", y=" + y +
                ", shape=" + shape +
                '}';
    }
}
