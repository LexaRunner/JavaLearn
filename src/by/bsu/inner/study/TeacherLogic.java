package by.bsu.inner.study;

public class TeacherLogic {
    public void excludeProcess(int rectorId,String nameStudent) {
        AbstractTeacher teacher = TeacherCreator.createTeacher(rectorId);
        System.out.println("Студент: " + nameStudent + " отчислен:" +
                teacher.excludeStudent(nameStudent));
    }
}
