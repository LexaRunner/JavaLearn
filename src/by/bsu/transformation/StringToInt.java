package by.bsu.transformation;

public class StringToInt {
    public static void main(String[] args) {
        String arg = "71";
        try {
            int value1 = Integer.parseInt(arg); // возврщает тип int
            int value2 = Integer.valueOf(arg); // возвращает Integer
            int value3 = Integer.decode(arg); // возвращает Integer
            int value4 = new Integer(arg); /* создает Integer, для преобразования приминяется редко*/
        } catch (NumberFormatException e) {
            System.err.println("Не верный формат числа " + e);
        }
    }
}
