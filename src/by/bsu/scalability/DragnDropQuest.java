package by.bsu.scalability;

import java.util.SortedMap;

public class DragnDropQuest extends AbstractQuest{
    // поля, конструкторы, методы
    @Override
    public boolean check(Answer ans) {
        System.out.println("Drag'n 'Drop quest");
        // проверка корректности ответа (True или False)
        return true;
    }
}
