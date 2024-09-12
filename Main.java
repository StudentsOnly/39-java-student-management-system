import java.util.HashMap;

public class Main{
    static HashMap<Integer, Student> students = new HashMap<>();
    public static void main(String[] args){

        addGraduateStudent(-1, "Bob", "Exceptions"); // id error
        addGraduateStudent(1, "Bob", "Exceptions");
        addUndergraduateStudent(2, "John", 1300); // year error
        addUndergraduateStudent(3, "John", 2000);

        printStudentsInfo(students);
    }

    static void addUndergraduateStudent(Integer id, String name, Integer year){
        UndergraduateStudent s1;
        try{
            s1 = new UndergraduateStudent(id, name, year);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            return;
        }
        students.put(s1.getStudentID(), s1);
    }

    static void addGraduateStudent(Integer id, String name, String researchTopic){
        GraduateStudent s1;
        try{
            s1 = new GraduateStudent(id, name, researchTopic);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            return;
        }
        students.put(s1.getStudentID(), s1);
    }


    static void printStudentsInfo(HashMap<Integer, Student> hashMap){
        for (var pair : hashMap.entrySet()){
            if (pair.getValue() instanceof GraduateStudent){
                GraduateStudent temp = (GraduateStudent) pair.getValue();
                System.out.println("Student type: " + temp.getClass().getName());
                System.out.println("ID: " + temp.getStudentID());
                System.out.println("Name: " + temp.getName());
                System.out.println("Topic: " + temp.getResearchTopic() + "\n");
            } else if (pair.getValue() instanceof UndergraduateStudent){
                UndergraduateStudent temp = (UndergraduateStudent) pair.getValue();
                System.out.println("Student type: " + temp.getClass().getName());
                System.out.println("ID: " + temp.getStudentID());
                System.out.println("Name: " + temp.getName());
                System.out.println("Year: " + temp.getYear() + "\n");
            } else System.err.println("Not a student");
        }
    }

}
