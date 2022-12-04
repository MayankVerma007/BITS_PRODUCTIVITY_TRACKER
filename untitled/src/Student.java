import javax.sound.midi.SysexMessage;
import java.util.List;
import java.util.Scanner;

public class Student {
    private String name;
    //private String password;
    private String bitsId;
    private float CGPA;

    private TimeTable TT = new TimeTable();

    private QuickNotesList QNLIST = new QuickNotesList();
    private CourseMain CM = new CourseMain();

    public Student(String name,String bitsId,float CGPA){
        this.name = name;
        this.bitsId = bitsId;
        this.CGPA = CGPA;
    }
    public Student(){
        this.name = "";
        this.bitsId = "";
        this.CGPA  = 0;
    }

    public String getBranchCode(String x){
        switch (x){
            case "A1":
                return("BE: Chemical");
            case "A2":
                return("BE: Civil");
            case "A3":
                return("BE: Electrical and Electronics");
            case "A4":
                return("BE: Mechanical");
            case "A5":
                return("BE: Pharmacy");
            case "A7":
                return("BE: Computer Science");
            case "A8":
                return("BE: Electronics and Instrumentation");
            case "AB":
                return("BE: Manufacturing");
            case "AA":
                return("BE: Electronics and Communication");
            case "B1":
                return ("MSc: Biology");
            case "B2":
                return ("MSc: Chemistry");
            case "B3":
                return ("MSc: Economics");
            case "B4":
                return ("MSc: Mathematics");
            case "B5":
                return ("MSc: Physics");
            default:
                return("");
        }
    }

    public TimeTable getTT() {
        return this.TT;
    }
    public CourseMain getCM(){return this.CM;}
    public QuickNotesList getQNLIST(){return this.QNLIST;}


    public void setTT(TimeTable TT) {
        this.TT = TT;
    }

    public String getBranch(){
        String a = getBranchCode(this.bitsId.substring(4,6));
        String b = getBranchCode(this.bitsId.substring(6,8));
        return (a+" "+b);
    }

    public String getYear() {
        switch(this.bitsId.substring(0,4)){
            case "2018":
                return("5th Year");
            case "2019":
                return("4th Year");
            case "2020":
                return("3rd Year");
            case "2021":
                return("2nd Year");
            case "2022":
                return("1st Year");
            default:
                return("Null");
        }
    }
    public void displayNotes(QuickNotesList quickNotesList){
        System.out.println(quickNotesList);
    }
    public void setName(String name){
        this.name = name;
    }
    public void setBitsId(String bitsId){
        this.bitsId = bitsId;
    }
    public void setCGPA(float CGPA){
        this.CGPA = CGPA;
    }




    public static void main(String[] args) {
        String a = "2020AAPS0841P";
        String c = a.substring(4,8);
        String b = "A";
        float e = (float) 9.16;
//        Student Mayank = new Student(c,c,a,e);
//        System.out.println(Mayank.getBranch());

        Student fahd = new Student(c,a,e);
        fahd.getTT().editTimeTable();
    }

}