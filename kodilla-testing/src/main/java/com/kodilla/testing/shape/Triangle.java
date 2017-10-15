package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private double a;
    private double h;
    private double field;

    @Override
    public String getShapeName() {
        return "triangle";
    }

    @Override
    public double getField() {
        field = (a * h)/2;
        return field;
    }
}
