package Package1;

public class Student {
    protected String name;
    protected int studentID;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public int getStudentID() {
        return studentID;
    }

    protected void displayInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Student ID: " + getStudentID());
    }
}