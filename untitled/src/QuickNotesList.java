import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
public class QuickNotesList {
    static ArrayList<QuickNotes> NotesList;
    public void addToNoteList(QuickNotes quickNotes){
        NotesList.add(quickNotes);
    }
    public void viewNotes(){
        System.out.println(NotesList);
    }
    public void makeNote(){

    }
//    try{
//        public void writeNotes(QuickNotes quickNotes){
//            FileWriter obj = new FileWriter("QuickNotes.txt");
//
//        }
//    }


}
