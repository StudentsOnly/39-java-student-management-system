public abstract class Student{
    protected String name;
    protected int studentID;

    public Student(String name, int studentID) throws IllegalArgumentException {
        validateID(studentID);
        this.name = name;
        this.studentID = studentID;
    }

    private static void validateID(int id) throws IllegalArgumentException {
        if (id < 0) throw new IllegalArgumentException("Negative id");
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getStudentID(){
        return studentID;
    }

    public void setStudentID(int studentID) throws IllegalArgumentException{
        validateID(studentID);
        this.studentID = studentID;
    }

}
