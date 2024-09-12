public class GraduateStudent extends Student{
    private String researchTopic;

    public GraduateStudent(int studentID, String name, String researchTopic) throws IllegalArgumentException {
        super(name, studentID);
        this.researchTopic = researchTopic;
    }

    public String getResearchTopic(){
        return researchTopic;
    }

    public void setResearchTopic(String researchTopic){
        this.researchTopic = researchTopic;
    }

}
