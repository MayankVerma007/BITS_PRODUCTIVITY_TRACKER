import java.lang.reflect.Array;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class QuickNotes {

    private String noteName;
    private String body;
    private String date;
    private static ArrayList<QuickNotes> quickNotes;

    public QuickNotes() {
        this.noteName = "";
        this.body = "";
        this.date = "";
    }

    public String getNoteName() {
        return this.noteName;
    }
    public void setNote() {
        System.out.println("Enter the Note Heading: ");
        Scanner sc = new Scanner(System.in);
        String b = sc.nextLine();
        System.out.println("Enter the Note Body: at last line enter 'END'");
        String c = "";
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            if (s.equals("End")||s.equals("END")||s.equals("end")){
                break;
            }
            c=c+s+'\n';
        }
        this.noteName = b;
        this.body= c.substring(0,c.length()-1);
        sc.close();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        this.date = dtf.format(now);
        quickNotes.add(this);
    }

    public String getBody() {
        return this.body;
    }
    public String getDate(){
        return this.date;
    }
    public void displayNote(){
        System.out.println("Note Title: "+getNoteName()+" ,Date and Time: "+getDate());
        System.out.println("Note Body: "+getBody());
    }
    public static void main(String[] args){
        QuickNotes abc = new QuickNotes();
        abc.setNote();
        abc.displayNote();
    }



}