package TeamCollab;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TeamMember {
    private Socket socket;
    private BufferedReader br;
    private BufferedWriter bw;
    private String studentMember;

    public TeamMember(Socket socket, String studentMember) {
        try {
            this.socket = socket;
            this.br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            this.bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            this.studentMember = studentMember;
        } catch (IOException e) {
            stopy(socket, br, bw);
        }
    }

    private void stopy(Socket socket, BufferedReader br, BufferedWriter bw) {
        try {
            if (br != null) {
                br.close();
            }
            if (bw != null) {
                bw.close();
            }
            if (socket != null) {
                socket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void sendMessage() {
        try {
            bw.write(studentMember);
            bw.newLine();
            bw.flush();

            Scanner sc = new Scanner(System.in);
            while (socket.isConnected()) {
                String messageToSend = sc.nextLine();
                bw.write(studentMember + ": " + messageToSend);
                bw.newLine();
                bw.flush();

            }

        } catch (IOException e) {
            stopy(socket, br, bw);
        }
    }

    public void listenForMessage() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                String msgFromGroupChat;
                while (socket.isConnected()) {
                    try {
                        msgFromGroupChat = br.readLine();
                        System.out.println(msgFromGroupChat);
                    } catch (IOException e) {
                        stopy(socket, br, bw);
                    }
                }
            }
        }).start();
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your BITS ID: ");
        String studentMember = sc.nextLine();
        Socket socket = new Socket("localhost",42069);
        TeamCollab.TeamMember client = new TeamCollab.TeamMember(socket,studentMember);
        client.listenForMessage();
        client.sendMessage();
    }
}