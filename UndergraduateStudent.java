public class UndergraduateStudent extends Student {
    private int year;

    public UndergraduateStudent(int id, String name, int year) throws IllegalArgumentException {
        super(name, id);
        validateYear(year);
        this.year = year;
    }

    private static void validateYear(int year) throws IllegalArgumentException {
        if (year < 1500) throw new IllegalArgumentException("UNI didn't exist this year");
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) throws IllegalArgumentException {
        validateYear(year);
        this.year = year;
    }


}
