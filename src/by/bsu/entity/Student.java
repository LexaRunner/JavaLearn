package by.bsu.entity;

import java.util.Vector;

public class Student implements Cloneable {
    private int id;
    private String name;
    private int age;
    private Vector<Byte> v = new Vector<>(); //список оценок - изменяемое поле
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setId(int id) {
        this.id = id;
    }
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Student other = (Student) obj;
        if (age != other.age) return false;
        if (id != other.id) return false;
        if (name == null) {
            if (other.name != null) return false;
        } else if (!name.equals(other.name)) {
            return false;
        }
        return true;
    }
    public int hashCode() {
        return (int)(31 * id + age + ((name == null) ? 0 : name.hashCode()));
    }

    @Override
    public String toString() {
        return getClass().getName() + "@name" + name + " id:" + id + " age:" + age;
    }

    public Student clone() {
        Student copy = null;
        try {
            copy = (Student) super.clone();
            copy.v = (Vector<Byte>) v.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return copy;
    }
}
