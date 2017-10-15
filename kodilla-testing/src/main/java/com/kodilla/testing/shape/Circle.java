package com.kodilla.testing.shape;

public class Circle implements Shape {
    private double r;
    private double field;

    @Override
    public String getShapeName() {
        return "circle";
    }

    @Override
    public double getField() {

        field = Math.PI*r*r;
        return field;
    }
}
