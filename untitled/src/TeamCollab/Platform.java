package TeamCollab;

//import ChatBox.MemberProcess;

import java.io.IOException;
import java.net.ServerSocket;

import java.net.Socket;

public class Platform {

    private ServerSocket serverSocket;

    public Platform(ServerSocket serverSocket) {
        this.serverSocket = serverSocket;
    }

    public void startServer() {

        try {

            while (!serverSocket.isClosed()) {
                Socket socket = serverSocket.accept();
                System.out.println("A new client has connected!");
                MemberProcess clientHandler = new MemberProcess(socket);

                Thread thread = new Thread(clientHandler);
                thread.start();
            }
        } catch(IOException e){

        }
    }
    public void closeServerSocket(){
        try{
            if(serverSocket != null){
                serverSocket.close();
            }
        } catch(IOException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(42069);
        TeamCollab.Platform server = new TeamCollab.Platform(serverSocket);
        server.startServer();
    }
}