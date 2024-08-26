import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        HashMap<Integer, Student> studentsList = new HashMap<>();

        Student student1 = new UndergraduateStudent("Alice", 1001, 3);
        Student student2 = new UndergraduateStudent("Bob", 1002, 3);
        Student student3 = new GraduateStudent("Charlie", 1003, "Artificial Intelligence");
        Student student4 = new GraduateStudent("Max", 1004, "Cybersecurity");

        studentsList.put(student1.getStudentID(), student1);
        studentsList.put(student2.getStudentID(), student2);
        studentsList.put(student3.getStudentID(), student3);
        studentsList.put(student4.getStudentID(), student4);

        for (Student student : studentsList.values()) {
            student.displayInfo();
            System.out.println();
        }


    }


}
