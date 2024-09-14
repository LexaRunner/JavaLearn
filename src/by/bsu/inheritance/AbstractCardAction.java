package by.bsu.inheritance;

public abstract class AbstractCardAction {
    private int id;
    public AbstractCardAction() {
        // конструктор
    }
    public boolean checkLimit() {
        return true;
    }
    public abstract void doPayment(double amountPayment);
}
