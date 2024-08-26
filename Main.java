import java.util.HashMap;
import java.util.Map;

public class Main{
    public static void main(String[] args) {

        HashMap<Integer, Student> students= new HashMap<>();
        GraduateStudent student1 = new GraduateStudent();
        student1.setName("John");
        student1.setStudentID(1212);
        student1.setResearchTopic("Berlin train system");

        GraduateStudent student2 = new GraduateStudent("Java. Access modifiers.");
        student2.setName("Barbara");
        student2.setStudentID(1313);

        UndergraduateStudent student4 = new UndergraduateStudent();
        student4.setName("Simone");
        student4.setStudentID(1412);
        student4.setYear(2022);

        UndergraduateStudent student3 = new UndergraduateStudent(2023);
        student3.setName("Marvin");
        student3.setStudentID(1413);

        addStudent(students, student1);
        addStudent(students, student2);
        addStudent(students, student3);
        addStudent(students, student4);

        UndergraduateStudent student5 = new UndergraduateStudent();
        student5.setName("Bella");
        student5.setStudentID(1212);
        student5.setYear(2020);

        addStudent(students, student5);

        display(students);

    }

    public static void addStudent(HashMap<Integer, Student> students, Student student){

        if(students.putIfAbsent(student.getStudentID(), student) !=null){
            System.err.println("ID '" + student.getStudentID() + "' belongs to another student");
        }else {
            System.out.println("\nStudent '" + student.getName() + "' added");
        }

    }

    public static void display(HashMap<Integer, Student> students){
        System.out.println("\nStudents:");
        for(Map.Entry<Integer, Student> entry: students.entrySet()){
            System.out.println(entry.getValue());

        }

    }

}
