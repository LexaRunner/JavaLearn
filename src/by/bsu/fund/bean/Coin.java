package by.bsu.fund.bean;

public class Coin {
    private double diameter;
    private double weight;
    public double getDiameter() {
        return diameter;
    }
    public void setDiameter(double value) {
        if (value > 0) {
            diameter = value;
        } else {
            System.out.println("Отрицательный диаметер");
        }
    }
    public double getWeightWeight() {
        return weight;
    }
    public void setWeight(double value) {
        weight = value;
    }
}
