package by.bsu.inner.study;

public class Runner {
    public static void main(String[] args) {
        TeacherLogic tl = new TeacherLogic();
        tl.excludeProcess(777, "Олейников");
        tl.excludeProcess(6, "Зашихин");
    }
}
