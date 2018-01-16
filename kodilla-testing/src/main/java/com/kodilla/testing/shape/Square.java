package com.kodilla.testing.shape;

public class Square implements Shape {

    Double lenght;
    Double field;

    public Square(Double lenght) {
        this.lenght = lenght;
    }

    public Double getLenght() {
        return lenght;
    }

    @Override
    public String getShapeName(){
        return "square";
    }

    @Override
    public Double getField(){
        Double field = lenght * lenght;
        return field;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square square = (Square) o;

        if (!lenght.equals(square.lenght)) return false;
        return field.equals(square.field);
    }

    @Override
    public int hashCode() {
        int result = lenght.hashCode();
        result = 31 * result + field.hashCode();
        return result;
    }
}
