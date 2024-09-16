import Package1.*;
import Package2.*;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        try {
            UndergraduateStudent ugStudent = new UndergraduateStudent();
            ugStudent.setName("Olga Brighton");
            ugStudent.setStudentID(101);
            ugStudent.setYear(3);
            manager.addStudent(ugStudent);

            GraduateStudent gradStudent = new GraduateStudent();
            gradStudent.setName("Michael Jefferson");
            gradStudent.setStudentID(102);
            gradStudent.setResearchTopic("Artificial Intelligence");
            manager.addStudent(gradStudent);

            // Display all students in the database
            manager.displayAllStudents();
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
