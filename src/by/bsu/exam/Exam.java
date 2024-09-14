package by.bsu.exam;

public class Exam <T extends Number>{
    private String name;
    private T mark; // параметр поля
    public Exam(T mark, String name) {
        this.name = name;
        this.mark = mark;
    }
    public T getMark() { // параметр метода
        return mark;
    }
    private int roundMark() {
        return Math.round(mark.floatValue()); // Метод класса Number
    }
    public boolean equalsToMark(Exam<?> ob) { // параметр метода
        return roundMark() == ob.roundMark();
    }
}
