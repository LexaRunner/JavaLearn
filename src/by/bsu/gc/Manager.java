package by.bsu.gc;

public class Manager {
    private int id;
    public Manager(int value) {
        id = value;
    }
    protected void finalize() throws Throwable {
        try {
            // код освобождения ресурсов
            System.out.println("Обьект удален, id=" + id);
        } finally {
            super.finalize();
        }
    }
}
