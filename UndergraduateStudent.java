public class UndergraduateStudent extends Student{

    protected int year;

    public UndergraduateStudent(){
        super();
        year = 2024;
    }

    public UndergraduateStudent(int year){
        super();
        this.year = year;
    }

    public void setYear(int year){
        this.year = year;
    }

    public int getYear(){
        return year;
    }

    @Override
    public String toString() {
        return super.toString() + "\n\tyear = " + year + ";";
    }
}
