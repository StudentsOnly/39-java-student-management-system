public class UndergraduateStudent extends Student {

    private int year;

    public UndergraduateStudent(String name, int studentID, int year) {
        super(name, studentID);
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return super.toString().substring(0,super.toString().length() - 1) + " Year: %-4d".formatted(year);
    }
}
