import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.*;
import java.net.Socket;

public class Client {
  public static void main (String[] args) {
    Client client = new Client();
    client.run();
  }

  public void run(){
    try{
      Socket socket = new Socket("localhost", 1025);

      //keyboard input
      InputStreamReader strReader = new InputStreamReader(System.in);
      BufferedReader reader = new BufferedReader(strReader);

      //sending to client
      PrintWriter writer = new PrintWriter(socket.getOutputStream(),true);

      //receiving from server
      BufferedReader receiveRead = new BufferedReader(new InputStreamReader(socket.getInputStream()));

      String receiveMessage, sendMessage;

      //reader.close();
      while(true){
        //keyboard reading
        sendMessage = reader.readLine();
        //sending to server
        writer.println(sendMessage);

        if((receiveMessage=receiveRead.readLine())!=null){
          //displaying client's query and server's reply
          System.out.println(sendMessage+"\n"+receiveMessage);
        }
      }
    }catch(IOException ex){
      ex.printStackTrace();
      System.out.println("Connection reset");
    }

  }
}
