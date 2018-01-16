package com.kodilla.testing.shape;
import java.util.ArrayList;

public class ShapeCollector {

    private ArrayList<Shape> shapeList = new ArrayList<Shape>();

    public void addFigure(Shape shape){
        shapeList.add(shape);
    }

    public boolean removeFigure(Shape shape){
        boolean result = false;
        if (shapeList.contains(shape)){
            shapeList.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n) {
        Shape result = shapeList.get(n);
        return result;
    }

    public void showFigures(){
        for (Shape figures: shapeList) {
            System.out.println(figures);
        }
    }

    public int getShapeQuantity(){
        return shapeList.size();
    }
}
