package by.bsu.point;

public class Point2D extends Point1D {
    private int y;
    public Point2D(int x, int y) {
        super(x);
        this.y = y;
    }

    @Override
    public double length() {
        return Math.hypot(super.length(), y);
        /* провто length() нельзя, т.к. метод будет вызывать сам себя, что
        приведет к бесконечной рекурсии и ошибке во время выполнения
         */
    }

    @Override
    public String toString() {
        return super.toString() + " y=" + y;
    }
}
