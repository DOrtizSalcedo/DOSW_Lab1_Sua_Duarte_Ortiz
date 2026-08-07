/**
 * A class with some representative data of the student.
 * 
 * @author Daniel Felipe Sua Siempira
 * @author Juan Pablo Duarte Silva
 * @author David Felipe Ortiz Salcedo
 */
public class Student {
    String name;
    int age;
    String email;
    int semester;

    public Student(String name, int age, String email, int semester) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.semester = semester;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public int getSemester() {
        return semester;
    }
}