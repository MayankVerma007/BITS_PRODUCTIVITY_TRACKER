import javax.sound.midi.SysexMessage;
import java.util.List;
import java.util.Scanner;

public class Student {
    private String name;
    private String password;
    private String bitsId;
    private float CGPA;

    private TimeTable TT;

    private List<QuickNotes> QNLIST;

    public Student(String name,String password,String bitsId,float CGPA){
        this.name = name;
        this.password = password;
        this.bitsId = bitsId;
        this.CGPA = CGPA;
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


    public static void main(String[] args) {
        String a = "2020AAPS0841P";
        String c = a.substring(4,8);
        String b = "A";
        float e = (float) 9.16;
//        Student Mayank = new Student(c,c,a,e);
//        System.out.println(Mayank.getBranch());

        Student.TT.editTimeTable();
        Student.TT.editTimeTable();
        System.out.println(Student.TT.getCourse(0).getLectureInstructor());
        
        
    }

}
