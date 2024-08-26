public class Student {

    protected String name;
    protected int studentID;

    public Student(){
        name = "";
        studentID = 00;
    }
    public Student(String name, int id){
        this.name = name;
        this.studentID = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public  void setStudentID(int id){
        this.studentID = id;
    }

    public String getName(){
        return name;
    }

    public int getStudentID(){
        return studentID;
    }

    @Override
    public String toString() {
        return "\n* Student:\n\tname = '" + name + "';\n\tid = " + studentID + ";";
    }
}
