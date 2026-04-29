package StudentClass;

import java.util.List;
import java.util.ArrayList;

public class StudentClass {
    private int id;
    private String name;
    private String studentClass;
    private int age;

    public StudentClass(int id , String name , String studentClass , int age ){
        this.id = id;
        this.name = name;
        this.studentClass = studentClass;
        this.age=age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    static void main() {
        List<StudentClass> list= new ArrayList<StudentClass>();
        StudentClass s1 = new StudentClass(1,"kirti koyal","Btech", 22);
        list.add(s1);

        list.add(new StudentClass(2,"kriti","Btech",21));
        list.add(new StudentClass(3,"Khushi","Betech",15));




    }

}
