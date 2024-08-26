public class UndergraduateStudent extends Student {

    private final int yearOfStudy;

    public UndergraduateStudent(String name, int studentID, int year) {
        super(name, studentID);
        this.yearOfStudy = year;
    }

    public int getYear() {
        return yearOfStudy;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(" ==> Undergraduate student in " + yearOfStudy + " year.");
    }
}

