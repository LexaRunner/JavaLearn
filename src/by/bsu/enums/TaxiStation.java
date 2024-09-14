package by.bsu.enums;

public enum TaxiStation {
    MERCEDES(10), TOYOTA(7), VOLVO;
    private int freeCabs; // поле класса перечисления
    TaxiStation() { // конструктор класса перечисления

    }
    TaxiStation(int cabs) { // конструктор класса перечисления
        freeCabs = cabs;
    }
    public int getFreeCabs() {
        return freeCabs;
    }
    public void setFreeCabs(int cabs) {
        freeCabs = cabs;
    }
    public String toString() {
        return String.format("%s : free cabs = %d", name(), freeCabs);
    }
}
