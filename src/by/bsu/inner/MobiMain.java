package by.bsu.inner;

public class MobiMain {
    public static void main(String[] args) {
        Abonent abonent = new Abonent(819002, "Aleksey Zashikhin");
        abonent.setTariffPlan("free");
        abonent.obrainPhoneNumber(7, 707);
        System.out.println(abonent);
    }
}
