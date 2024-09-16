package Package1;

import java.util.HashMap;

public class StudentManager {
    private HashMap<Integer, Student> studentMap;

    public StudentManager() {
        studentMap = new HashMap<>();
    }

    public void addStudent(Student student) {
        if (student == null) {
            throw new IllegalArgumentException("Student cannot be null.");
        }
        if (studentMap.containsKey(student.getStudentID())) {
            throw new IllegalArgumentException("A student with ID " + student.getStudentID() + " already exists.");
        }
        studentMap.put(student.getStudentID(), student);
    }

    public void displayAllStudents() {
        if (studentMap.isEmpty()) {
            System.out.println("No students in the database.");
        } else {
            for (Student student : studentMap.values()) {
                student.displayInfo();
                System.out.println();
            }
        }
    }
}
