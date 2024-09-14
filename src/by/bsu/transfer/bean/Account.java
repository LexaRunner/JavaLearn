package by.bsu.transfer.bean;

public class Account {
    private long id;
    private double amount;
    // конструктор без параметров
    public Account() { // наличие этого конструктора неккоректно по смыслу класса
        super();
        /* если класс будет обьявлен вообще без конструктора , то
        компилятор предоставит его именно в таком виде
         */
    }
    // конструктор с параметром
    public Account(long id) {
        super(); /* вызов конструктора суперкласса явным образом необязателен,
        компилятор вставит его автоматически
        */
        this.id = id;
    }
    public Account(long id, double amount) {
        this.id = id;
        this.amount = amount;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public long getId () {
        return id;
    }
    public void setId (long id) {
        this.id = id;
    }
    public void addAmount(double amount) {
        /* данный метод в общем случае можно обьявлять в другом классе */
        this.amount += amount;
    }
}
