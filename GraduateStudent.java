public class GraduateStudent extends Student {

    private String researchTopic;

    public GraduateStudent(String name, int studentID, String researchTopic) {
        super(name, studentID);
        this.researchTopic = researchTopic;
    }

    public String getResearchTopic() {
        return researchTopic;
    }

    public void setResearchTopic(String researchTopic) {
        this.researchTopic = researchTopic;
    }

    @Override
    public String toString() {
        return super.toString().substring(0,super.toString().length() - 1)
                + " Research Topic: %-20s".formatted(researchTopic);
    }
}
