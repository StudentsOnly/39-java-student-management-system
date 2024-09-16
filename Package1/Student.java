package Package1;

public class Student {
    protected String name;
    protected int studentID;

    public void setName(String name) {

        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty.");
        }
    }

    public String getName() {
        return name;
    }

    public void setStudentID(int studentID) {

        if (studentID <= 0) {
            throw new IllegalArgumentException("Student ID must be a positive number.");
        }
    }

    public int getStudentID() {
        return studentID;
    }

    protected void displayInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Student ID: " + getStudentID());
    }
}