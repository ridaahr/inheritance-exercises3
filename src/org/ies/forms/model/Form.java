package org.ies.forms.model;

public abstract class Form {
    protected String color;

    public Form(String color) {
        this.color = color;
    }

    public abstract double area();
    public abstract void info();
}
