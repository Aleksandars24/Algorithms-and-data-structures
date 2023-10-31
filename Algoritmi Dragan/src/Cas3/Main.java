package Cas3;
class Student{
    private String name;
    private String lastname;
    private int index;

    public Student() {
    }

    public Student(String name, String lastname, int index) {
        this.name = name;
        this.lastname = lastname;
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(short index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", index=" + index +
                '}';
    }
}
public class Main {
    @Override
    public String toString() {
        return "Main{}";
    }

    public static void main(String[] args) {
        Student student=new Student("Dragan","Draganski",222001);
        System.out.println(student.toString());


    }
}
