package by.bsu.creator;

import by.bsu.point.Point1D;
import by.bsu.point.Point3D;

public class Point3DCreator extends Point2DCreator{
    @Override
    public Point1D createPoint() {
        System.out.println("Point3D");
        return new Point3D(3,7, 8);
    }
}
