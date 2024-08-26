public class GraduateStudent extends Student {

    private final String researchTopic;

    public GraduateStudent(String name, int studentID, String researchTopic) {
        super(name, studentID);
        this.researchTopic = researchTopic;
    }

    public String getResearchTopic() {
        return researchTopic;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Is a Graduate Student.");
        System.out.println("Research Topic: " + researchTopic);
    }
}
