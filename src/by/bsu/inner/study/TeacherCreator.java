package by.bsu.inner.study;

public class TeacherCreator {
    public static AbstractTeacher createTeacher(int id) {
        // обьявление класса внутри метода
        class Rector extends AbstractTeacher {
            Rector (int id) {
                super(id);
            }
            @Override
            public boolean excludeStudent(String name) {
                if (name != null) { // изменение статуса студента в базе данных
                    return true;
                } else {
                    return false;
                }
            }
        }
        if (isRectorId(id)) {
            return new Rector(id);
        } else {
            return new Teacher(id);
        }
    }
    private static boolean isRectorId(int id) {
        // проверка id
        return id == 6;
    }
}
