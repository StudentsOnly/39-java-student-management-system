package Package2;
import Package1.*;

public class UndergraduateStudent extends Student {
    private int year;

    public void setYear(int year) {
        if (year < 1) {
            throw new IllegalArgumentException("Year of study must be 1 or greater.");
        }
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Year of Study: " + getYear());
    }
}