package TeamCollab;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.*;
import java.net.Socket;
import java.util.ArrayList;

public class MemberProcess implements Runnable {
    public static ArrayList<TeamCollab.MemberProcess> members = new ArrayList<>();
    private Socket sc;
    private BufferedReader br;
    private BufferedWriter bw;
    private String studentID;

    public MemberProcess(Socket sc) {

        try {
            this.sc = sc;
            this.bw = new BufferedWriter(new OutputStreamWriter(sc.getOutputStream()));
            this.br = new BufferedReader(new InputStreamReader(sc.getInputStream()));
            this.studentID = br.readLine();
            members.add(this);
            messageForAll("Server: " + studentID + " has entered the chat!");
        } catch (IOException e){
            stopy(sc, br, bw);
        }
    }

    @Override

    public void run() {
        String msgStudent;
        while(sc.isConnected()){
            try{
                msgStudent = br.readLine();
                messageForAll(msgStudent);
            } catch(IOException e){
                stopy(sc,br,bw);
                break;
            }
        }

    }
    public void messageForAll(String messageToSend){
        for(TeamCollab.MemberProcess studentMember : members){
            try{
                if(!studentMember.studentID.equals(studentID)){
                    studentMember.bw.write(messageToSend);
                    studentMember.bw.newLine();
                    studentMember.bw.flush();
                }
            } catch (IOException e){
                stopy(sc,br,bw);
            }
        }
    }
    public void stopy(Socket sc,BufferedReader br,BufferedWriter bw){
        try{
            if(br !=null){
                br.close();
            }
            if(bw != null){
                bw.close();
            }
            if(sc!=null){
                sc.close();
            }
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
