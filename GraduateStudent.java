public class GraduateStudent extends Student{

    protected String researchTopic;

    public GraduateStudent(){
        super();
        researchTopic = "";
    }

    public GraduateStudent(String researchTopic){
        this.researchTopic = researchTopic;
    }

    public void setResearchTopic(String researchTopic){
        this.researchTopic = researchTopic;
    }

    public String getResearchTopic(){
        return researchTopic;
    }

    @Override
    public String toString() {
        return super.toString() + "\n\tresearch topic = '" + researchTopic + "';";
    }
}
