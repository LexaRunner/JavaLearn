package by.bsu.inheritance;

public class CardRunner {
    public static void main(String[] args) {
        AbstractCardAction action;
        action = new CreditCardAction();
        action.doPayment(100);
    }
}
