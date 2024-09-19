package by.bsu.shapes;

import by.bsu.shapes.action.IShapeAction;
import by.bsu.shapes.action.RectangleAction;
import by.bsu.shapes.action.TriangleAction;
import by.bsu.shapes.action.entity.Rectangle;
import by.bsu.shapes.action.entity.Triangle;

import static java.lang.Math.PI;

public class ActionMain {
    public static void main(String[] args) {
        Rectangle rectShape = new Rectangle(2, 3);
        IShapeAction<Rectangle> rectAction = new RectangleAction();
        Triangle trShape = new Triangle(3, 4, PI/6);
        IShapeAction<Triangle> trAction = new TriangleAction();
        System.out.println("Square rectangle: " + rectAction.computeSquare(rectShape));
        System.out.println("Perimeter rectangle: " + rectAction.computePerimeter(rectShape));
        System.out.println("Square triangle: " + trAction.computeSquare(trShape));
        System.out.println("Perimeter triangle: " + trAction.computePerimeter(trShape));
    }
}
