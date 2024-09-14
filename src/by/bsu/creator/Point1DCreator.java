package by.bsu.creator;

import by.bsu.point.Point1D;

public class Point1DCreator {
    public Point1D createPoint() {
        System.out.println("Point1D");
        return new Point1D(1);
    }
}
