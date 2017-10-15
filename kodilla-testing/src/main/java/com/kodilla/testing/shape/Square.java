package com.kodilla.testing.shape;

public class Square implements Shape {
    private double a;
    private double field;

    @Override
    public String getShapeName() {
        return "square";
    }

    @Override
    public double getField() {
        field = a * a;
        return field;
    }
}
