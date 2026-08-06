import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 * Shows a message about the students.
 * 
 * @author Daniel Felipe Sua Siempira
 * @author Juan Pablo Duarte Silva
 * @author David Felipe Ortiz Salcedo
 */
public class WelcomeMessage {
    public static void main(String[] args) {
        java.util.List<Student> listStudents = new ArrayList<>();

        Student student1 = new Student("Daniel Sua", 20, "daniel.sua-s@mail.escuelaing.edu.co", 7);
        Student student2 = new Student("Juan Pablo Duarte", 21, "juan.duarte-s@mail.escuelaing.edu.co", 8);
        Student student3 = new Student("David Ortiz", 20, "david.osalcedo@mail.escuelaing.edu.co", 7);

        listStudents.add(student1);
        listStudents.add(student2);
        listStudents.add(student3);

        String studentsInformation = listStudents.stream()
            .map(s -> String.format(
                "%s, a %dth-semester student, %d years old", 
                s.getName(),
                s.getSemester(),
                s.getAge(),
                s.getEmail()
            ))
        .collect(Collectors.joining(", \nand "));

        String message = "Hello and welcome! \n\n" +
            "We are " + studentsInformation + ". \n" +
            "\nOur institutional emails are:\n" +
            listStudents.stream()
                .map(Student::getEmail)
                .collect(Collectors.joining("\n"));

        System.out.println(message);
    }
}

