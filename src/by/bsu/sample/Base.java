package by.bsu.sample;

public class Base {
    public static void go() {
        System.out.println("Метод из Base");
    }
}
class Sub extends Base {
    public static void go() {
        System.out.println("Метод из Sub");
    }
}
class Runner {
    public static void main(String[] args) {
        Base ob = new Sub();
        ob.go();
    }
}