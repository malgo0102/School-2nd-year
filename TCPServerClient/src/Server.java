import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
  public static void main(String[] args){
    Server server = new Server();
    server.run();
  }

  public void run(){
    try{
      ServerSocket servSocket = new ServerSocket(1025);

        Socket socket = servSocket.accept();
        //sending to client
        PrintWriter writer = new PrintWriter(socket.getOutputStream(),true);
        //receiving from client
        BufferedReader receiveRead = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        String receiveMessage, sendMessage;
        String[] serverProtocol ={"HELLO","I'M GOOD","YAY!"};
        String [] clientProtocol ={"hi","how are you?","let's start"};
      for(int i = 0; i<serverProtocol.length; i++) {
        sendMessage = serverProtocol[i];
//      while(true){
        if ((receiveMessage = receiveRead.readLine()) != null) {
          //displaying client's query and server's reply
          if (receiveMessage.equals(clientProtocol[i])) {
            //sending to server
            writer.println(sendMessage);

            System.out.println(receiveMessage + "\n" + sendMessage);
          } else {
            System.out.println("Wrong protocol. Connection will be closed");
            writer.println("Wrong protocol. Connection will be closed");
            socket.close();
          }
        }
      }
    }catch(IOException ex){
      ex.printStackTrace();
      System.out.println("Connection reset");
    }
  }
}
