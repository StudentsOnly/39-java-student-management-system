import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main{

    public static void main(String[] args) {

        HashMap<Integer, Student> students = new HashMap<>(Map.of(
                123421, new UndergraduateStudent("Ralf", 123421, 1987),
                635422, new UndergraduateStudent("Thomas", 635422, 1990),
                726348, new GraduateStudent("Sarah", 726348, "Electron Spin"),
                465832, new GraduateStudent("Eva", 465832, "Quantum Dots")
        ));

        students.putIfAbsent(465832, new UndergraduateStudent("Eva", 465832, 1966));
        students.putIfAbsent(532445, new GraduateStudent("Gerd", 532445, "SC"));

        printStudents(students);

        // Practicing Map methods
        System.out.println("Student get: " + students.get(465832));
        System.out.println("Student put: " + students.put(465832, new Student("Eva2", 465832)));
        System.out.println("Student get again: " + students.get(465832));
        System.out.println("Student contains: " + students.containsKey(465832));
        System.out.println("Student removed: " + students.remove(465832));
        System.out.println("Student get again: " + students.get(465832));
    }

    public static void printStudents(Map<Integer,Student> students){
        System.out.println("Students");
        System.out.println("----------------------------------------");
        students.forEach((id, student) -> System.out.println(student));
        System.out.println();
    }

}
