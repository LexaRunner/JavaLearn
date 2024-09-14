package by.bsu.fund.entity;

public class Coin {
    private double diameter;
    public Coin(double diameter) {
        super();
        initDiameter(diameter); // обращение к методу финал
    }
    public final void initDiameter(double value) { // можно public final заменить на private
        if (value > 0) {
            diameter = value;
        } else {
            System.out.println("Отрицательный диаметр!");
        }
    }
}
