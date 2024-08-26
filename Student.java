import java.util.Objects;

public class Student {

    protected String name;
    protected int studentID;

    public Student(String name, int studentID) {
        this.name = name;
        this.studentID = studentID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentID == student.studentID && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, studentID);
    }

    public String getName() {
        return name;
    }

    public int getStudentID() {
        return studentID;
    }

    public void displayInfo() {
        System.out.print("Student = " + name + " ID =  " + studentID);
    }

}
