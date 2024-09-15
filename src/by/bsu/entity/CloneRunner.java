package by.bsu.entity;

public class CloneRunner {
    private static void mutation(Student p) {
        p = (Student) p.clone();
        p.setId(1000);
        System.out.println("->id = " + p.getId());
    }

    public static void main(String[] args) {
        Student ob = new Student(100, "Aleksey", 38);
        System.out.println("id = " + ob.getId());
        mutation(ob);
        System.out.println("id = " + ob.getId());
    }
}
