import java.lang.reflect.Array;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class QuickNotes {
    private String noteName;
    private String body;
    private String date;
    static ArrayList<QuickNotes> NotesList = new ArrayList<>();
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
        //sc.close();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        this.date = dtf.format(now);
        NotesList.add(this);
    }
    public String getBody() {
        return this.body;
    }
    public String getDate(){
        return this.date;
    }
    public void addToNoteList(QuickNotes quickNotes){
        NotesList.add(quickNotes);
    }
    public static void viewNotes(){
        if(NotesList.isEmpty()){
            System.out.println("No Notes Entered till now.");
        }
        else{
            for(int i=0;i<NotesList.size();i++){
                NotesList.get(i).displayNote(NotesList.get(i));
            }
        }
    }
    public void displayNote(QuickNotes quickNotes){
        System.out.println("Note Title: "+quickNotes.getNoteName()+" ,Date and Time: "+quickNotes.getDate());
        System.out.println("Note Body: "+quickNotes.getBody());
    }
    public static void main(String[] args){
        String ans = "Y";
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to enter Notes Functionality?:(Y/N)");
        ans = sc.nextLine();
        while(ans.equals("Y")){
            System.out.println("Press 1 to create notes, Press 2 to view notes: ");
            int n = sc.nextInt();
            if(n==1){
                QuickNotes abc = new QuickNotes();
                abc.setNote();
            }
            else{
                viewNotes();
            }
            System.out.println("Again want to enter notes functionality?(Y/N): ");
            ans  = sc.next();
        }
    }
}