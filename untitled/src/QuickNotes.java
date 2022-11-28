import java.util.Scanner;

public class QuickNotes {


    private String noteName;
    private String body;
    private String specialDetails;

    public QuickNotes(String noteName) {
        this.noteName = noteName;
    }

    public void setSpecDet()
    {
        Scanner sc = new Scanner(System.in);
        this.specialDetails = sc.nextLine();
        sc.close();
    }

    public void setBody(String body) {
        Scanner sc = new Scanner(System.in);
        this.body = sc.nextLine();
        sc.close();
    }


    public String getNoteName() {
        return noteName;
    }

    public void setNoteName(String noteName) {
        this.noteName = noteName;
    }

    public String getBody() {
        return body;
    }

    public String getSpecialDetails() {
        return specialDetails;
    }

}
