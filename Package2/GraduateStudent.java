package Package2;
import Package1.*;

public class GraduateStudent extends Student {
    private String researchTopic;

    public void setResearchTopic(String researchTopic) {

        if (researchTopic == null || researchTopic.trim().isEmpty()) {
            throw new IllegalArgumentException("Research topic cannot be null or empty.");
        }
        this.researchTopic = researchTopic;
    }

    public String getResearchTopic() {
        return researchTopic;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Research Topic: " + getResearchTopic());
    }
}