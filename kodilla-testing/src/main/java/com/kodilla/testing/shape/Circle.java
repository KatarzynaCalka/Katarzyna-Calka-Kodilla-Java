package com.kodilla.testing.shape;

public class Circle implements Shape {

    Double radius;
    Double field;

    public Circle(Double radius) {
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    @Override
    public String getShapeName(){
        return "circle";
    }

    @Override
    public Double getField(){
        Double field = Math.PI * radius * radius;
        return field;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        if (!radius.equals(circle.radius)) return false;
        return field.equals(circle.field);
    }

    @Override
    public int hashCode() {
        int result = radius.hashCode();
        result = 31 * result + field.hashCode();
        return result;
    }
}
