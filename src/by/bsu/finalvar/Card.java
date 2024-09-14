package by.bsu.finalvar;

public class Card {
    // инициализированная константа экземпляра
    public final int ID = (int)(Math.random()*10_000_000);
    // неинициализированная константа
    public final long BANK_ID; // иницализация по умолчанию не производится!
    // {BANK_ID = 11111111L;} // только один раз!!!
    public Card(long id) {
        // иницализация в конструкторе
        BANK_ID = id; // только один раз!!!
    }
    public final boolean checkRights(final int NUMBER) {
        final int CODE = 72173394; // антишаблон: "Волшебное число"//
        // ID = 1; //ошибка компиляции
        // NUMBER = 1; //ошибка компиляции
        // CODE = 1; //ошибка компиляции
        return CODE == NUMBER + ID;
    }
}
