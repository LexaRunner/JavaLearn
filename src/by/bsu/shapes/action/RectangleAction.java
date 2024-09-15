package by.bsu.shapes.action;

import by.bsu.shapes.action.entity.AbstractShape;
import by.bsu.shapes.action.entity.Rectangle;

public class RectangleAction implements IShapeAction{
    // реализация метода из интерфейса
    @Override
    public double computeSquare(AbstractShape shape) {
        // площадь прямоугольника
        double square = 0;
        if (shape instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape;
            square = rectangle.getA() * rectangle.getB();
        } else {
            throw new IllegalArgumentException("Incompatible shape:"
            + shape.getClass());
        }
        return square;
    }
    // реализация метода из интерфейса
    @Override
    public double computePerimeter(AbstractShape shape) {
        double perimeter = 0;
        if (shape instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape;
            perimeter = 2 * (rectangle.getA() + rectangle.getB());
        } else {
            throw new IllegalArgumentException("Incompatible shape:"
            + shape.getClass());
        }
        return perimeter;
    }

}
