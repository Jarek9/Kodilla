package com.kodilla.patterns.factory_task;

public class TaskFactory {

    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Buying ", " oranges.", 10);
            case PAINTING:
                return new PaintingTask("Painting ", "black ", "cat.");
            case DRIVING:
                return new DrivingTask("Pick up kid ", "to school", "car.");
            default:
                return null;
        }

    }
}
