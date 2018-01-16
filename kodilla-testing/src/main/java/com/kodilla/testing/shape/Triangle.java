package com.kodilla.testing.shape;

public class Triangle implements Shape {

    Double lenght;
    Double height;
    Double field;

    public Triangle(Double lenght, Double height) {
        this.lenght = lenght;
        this.height = height;
    }

    public Double getLenght() {
        return lenght;
    }

    public Double getHeight() {
        return height;
    }

    @Override
    public String getShapeName(){
        return "triangle";
    }

    @Override
    public Double getField(){
        Double field = 0.5 * lenght * height;
        return field;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (!lenght.equals(triangle.lenght)) return false;
        if (!height.equals(triangle.height)) return false;
        return field.equals(triangle.field);
    }

    @Override
    public int hashCode() {
        int result = lenght.hashCode();
        result = 31 * result + height.hashCode();
        result = 31 * result + field.hashCode();
        return result;
    }
}
