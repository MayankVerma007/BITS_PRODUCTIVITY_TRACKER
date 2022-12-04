import java.util.Scanner;
import java.util.SortedMap;

public class Course {
    private int courseUnits;
    private String courseTitle;
    private int[] lectureHours;  //Each entry in the String array is of the form "Day-Hour"
    private int tutorialSection;
    private int lectureSection;
    private int tutorialHour; //Mentioned as "Day-Hour"
    //private String lectureInstructor;
    //private String tutInstructor;
    private int labSection ;
    private int labHour;



//    public Course(int courseUnits, int[] lectureHours, int tutorialSection, int lectureSection, int tutorialHour, int labSection, int labHour) {
//        this.courseUnits = courseUnits;
//        this.lectureHours = lectureHours;
//        this.tutorialSection = tutorialSection;
//        this.lectureSection = lectureSection;
//        this.tutorialHour = tutorialHour;
//        this.labHour = labHour;
//        this.labSection = labSection;
//    }



    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public int getCourseUnits() {
        return courseUnits;
    }

    public void setCourseUnits(int courseUnits) {
        this.courseUnits = courseUnits;
    }

    public int[] getLectureHours() {
        return lectureHours;
    }

    public void setLectureHours(int[] lectureHours) {
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

    public int getTutorialHour() {
        return tutorialHour;
    }

    public void setTutorialHour(int tutorialHour) {
        this.tutorialHour = tutorialHour;
    }

//    public String getLectureInstructor() {
//        return lectureInstructor;
//    }

//    public void setLectureInstructor(String lectureInstructor) {
//        this.lectureInstructor = lectureInstructor;
//    }

//    public String getTutInstructor() {
//        return tutInstructor;
//    }

//    public void setTutInstructor(String tutInstructor) {
//        this.tutInstructor = tutInstructor;
//    }

    public int getLabSection() {
        return labSection;
    }

    public void setLabSection(int labSection) {
        this.labSection = labSection;
    }

    public int getLabHour() {
        return labHour;
    }

    public void setLabHour(int labHour) {
        this.labHour = labHour;
    }

    public Course toAddNewCourse()
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter course details-");
        //Course instructor
//        System.out.print("Enter lecture Instructor");
//        this.lectureInstructor = sc.nextLine();
        //tut instructor
//        System.out.print("Enter tut instructor");
//        this.tutInstructor = sc.nextLine();
        //course name
        System.out.print("Course Name-");
        this.courseTitle = sc.nextLine();
        //course units
        System.out.print("Course Units-");
        this.courseUnits = sc.nextInt();
        //lecture section
        System.out.print("Lecture section-");
        this.lectureSection= sc.nextInt();
        sc.nextLine();
        //lecture hour
        System.out.print("Lecture Hours-");
        String hourList = sc.nextLine();
        String[] hourLst = hourList.split(" ");
        for(int i=0;i<hourLst.length;i++)
        {
            int value = Integer.parseInt(hourLst[i]);
        }

        System.out.println("Tutorial Exists? Yes/No");

        String ans = sc.nextLine();
        if ("Yes".equals(ans)) {
            System.out.println("Enter tut section and hour.");
            String details = sc.nextLine();
            //tutorial section and hour
            this.tutorialSection = Integer.parseInt(details.split(" ", 0)[0]);
            this.tutorialHour = Integer.parseInt(details.split(" ", 0)[1]);
        }
        else if("No".equals(ans))
        {
            this.tutorialSection = 0;
            this.tutorialHour = 0;
        }
        System.out.println("Lab Exists? Yes/No");
        ans = sc.nextLine();
        if ("Yes".equals(ans)) {
            System.out.println("Enter lab section.");
            String details = sc.nextLine();
            //lab section and hour
            this.labSection = Integer.parseInt(details.split(" ", 0)[0]);
            this.labHour = Integer.parseInt(details.split(" ", 0)[1]);
        } else if ("No".equals(ans)){
            this.labSection = 0;
            this.labHour = 0;
        }
        System.out.println("Course Sucessfully Created");

        return this;

    }
}
