package by.bsu.shapes.action.entity;

public class Triangle extends AbstractShape{
    private double b;
    private double angle;
    public Triangle(double a, double b, double angle) {
        super(a);
        this.b = b;
        this.angle = angle;
    }

    public double getAngle() {
        return angle;
    }

    public double getB() {
        return b;
    }
    public double getC() {
        double c = 3;
        return c;
    }
}
