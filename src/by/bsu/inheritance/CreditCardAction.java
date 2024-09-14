package by.bsu.inheritance;

public class CreditCardAction extends AbstractCardAction{
  /*  // поля, конструкторы, методы
    public boolean checkCreditLimit() { // собственный метод
        return true; // stub
    }*/

    @Override
    public void doPayment(double amountPayment) { // переопределенный метод
        // реализация
        System.out.println("complete from credit card");
    }
}
