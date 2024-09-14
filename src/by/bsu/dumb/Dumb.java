package by.bsu.dumb;

public class Dumb extends Object{
    {this.id = 6;}
    int id;
    Dumb() {
        System.out.println("Конструктор класса Dumb ");
        id = this.getId();
        System.out.println(" id=" + id);
    }
    int getId() {
        System.out.println("getId() класса Dumb");
        return id;
    }
    class Dumber extends Dumb {
        int id = 9;
        Dumber() {
            System.out.println("конструктор класса Dumber ");
            id = this.getId();
            System.out.println(" id="+id);
        }
        @Override
        int getId() {
            System.out.println("getId() класса Dumber");
            return id;
        }
    }
}
