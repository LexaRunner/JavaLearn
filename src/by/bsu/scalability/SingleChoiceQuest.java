package by.bsu.scalability;

public class SingleChoiceQuest extends AbstractQuest{
    // поля, конструкторы, методы

    @Override
    public boolean check(Answer ans) {
        System.out.println("Single choice quest");
        // проверка ответа True или False
        return true;
    }
}
