package by.bsu.fund.run;

import by.bsu.fund.action.CompareCoin;
import by.bsu.fund.bean.Coin;

public class Runner {
    public static void main(String[] args) {
        Coin ob1 = new Coin();
        ob1.setDiameter(-0.11); //сообщение о неправильных данных
        ob1.setDiameter(0.12);
        ob1.setWeight(150);
        Coin ob2 = new Coin();
        ob2.setDiameter(0.21);
        ob2.setWeight(170);
        CompareCoin ca = new CompareCoin();
        ca.compareDiameter(ob1, ob2);
    }
}
