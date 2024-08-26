package Package1;

import java.util.HashMap;

public class StudentManager {
    private HashMap<Integer, Student> studentMap;

    public StudentManager() {
        studentMap = new HashMap<>();
    }

    public void addStudent(Student student) {
        studentMap.put(student.getStudentID(), student);
    }

    public void displayAllStudents() {
        for (Student student : studentMap.values()) {
            student.displayInfo();
            System.out.println();
        }
    }
}