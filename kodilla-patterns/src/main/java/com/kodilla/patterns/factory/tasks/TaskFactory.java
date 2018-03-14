package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING_TASK = "SHOPPING_TASK";
    public static final String PAINTING_TASK = "PAINTING_TASK";
    public static final String DRIVING_TASK = "DRIVING_TASK";

    public final Task makeTask(final String taskType) {
        switch (taskType) {
            case SHOPPING_TASK:
                return new ShoppingTask("Shopping", "ski", 2.0);
            case PAINTING_TASK:
                return new PaintingTask("Painting", "white", "room");
            case DRIVING_TASK:
                return new DrivingTask("Driving", "Alpy", "car");
            default:
                return null;
        }
    }
}
