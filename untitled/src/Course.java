public class Course {
    private int courseUnits;
    private String[] lectureHours;  //Each entry in the String array is of the form "Day-Hour"
    private int tutorialSection;
    private int lectureSection;
    private String tutorialHour; //Mentioned as "Day-Hour"
    private int numberOfEvals;



    public Course(int courseUnits, String[] lectureHours, int tutorialSection, int lectureSection, String tutorialHour, int numberOfEvals) {
        this.courseUnits = courseUnits;
        this.lectureHours = lectureHours;
        this.tutorialSection = tutorialSection;
        this.lectureSection = lectureSection;
        this.tutorialHour = tutorialHour;
        this.numberOfEvals = numberOfEvals;
    }

    public int getCourseUnits() {
        return courseUnits;
    }

    public void setCourseUnits(int courseUnits) {
        this.courseUnits = courseUnits;
    }

    public String[] getLectureHours() {
        return lectureHours;
    }

    public void setLectureHours(String[] lectureHours) {
        this.lectureHours = lectureHours;
    }

    public int getTutorialSection() {
        return tutorialSection;
    }

    public void setTutorialSection(int tutorialSection) {
        this.tutorialSection = tutorialSection;
    }

    public int getLectureSection() {
        return lectureSection;
    }

    public void setLectureSection(int lectureSection) {
        this.lectureSection = lectureSection;
    }

    public String getTutorialHour() {
        return tutorialHour;
    }

    public void setTutorialHour(String tutorialHour) {
        this.tutorialHour = tutorialHour;
    }

    public int getNumberOfEvals() {
        return numberOfEvals;
    }

    public void setNumberOfEvals(int numberOfEvals) {
        this.numberOfEvals = numberOfEvals;
    }
}
