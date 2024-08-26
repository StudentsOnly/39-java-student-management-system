import java.util.HashMap;

public class Main{
    public static void main(String[] args){
        HashMap<Integer, Student> students = new HashMap<>();
        students.put(1, new UndergraduateStudent());
        students.put(2, new GraduateStudent());

        setUndergraduateAttributes(students.get(1), 1, "Bob", 2024);
        setGraduateAttributes(students.get(2), 2, "Alex", "Inheritance");

        /*
        We can also first create an objects -> set parameters -> put obj in HashMap:
            UndergraduateStudent s1 = new UndergraduateStudent();
            s1.setName("John");
            s1.setYear(2024);
            s1.setStudentID(1);
            students.put(s1.getStudentID(),s1);

            GraduateStudent s2 = new GraduateStudent();
            s2.setName("Alex");
            s2.setResearchTopic("Inheritance");
            s2.setStudentID(2);
            students.put(s2.getStudentID(),s2);
         */

        printStudentsInfo(students);
    }

    static void setUndergraduateAttributes(Student student, Integer id, String name, Integer year){
        UndergraduateStudent temp = (UndergraduateStudent) student;
        temp.setName(name);
        temp.setYear(year);
        temp.setStudentID(id);
    }

    static void setGraduateAttributes(Student student, Integer id, String name, String researchTopic){
        GraduateStudent temp = (GraduateStudent) student;
        temp.setName(name);
        temp.setResearchTopic(researchTopic);
        temp.setStudentID(id);
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
