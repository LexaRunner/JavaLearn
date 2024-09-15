package by.bsu.inner;

public class Ship {
    // поля и конструкторы
    private Engine eng;
    // abstract, final, private, protected - допустимы
    public class Engine {
        public void launch() {
            System.out.println("Запуск двигателя");
        }
    }
    public final void init() {
        eng = new Engine();
        eng.launch();
    }
}
