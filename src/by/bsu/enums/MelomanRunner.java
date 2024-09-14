package by.bsu.enums;

public class MelomanRunner {
    public static void main(String[] args) {
        MusicStyle ms = MusicStyle.CLASSIC; // инициализация
        System.out.print(ms);
        switch (ms) {
            case JAZZ -> System.out.println(" is Jazz");
            case CLASSIC -> System.out.println(" is Classic");
            case ROCK -> System.out.println(" is Rock");
            default -> System.out.println(" Unknown music Style: " + ms);
        }
    }
}
