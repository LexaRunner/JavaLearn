package by.bsu.creator;

import by.bsu.point.Point1D;
import by.bsu.point.Point2D;

public class Point2DCreator extends Point1DCreator {
    @Override
    public Point1D createPoint() {
        System.out.println("Point2D");
        return new Point2D(2, 5);
    }
}
