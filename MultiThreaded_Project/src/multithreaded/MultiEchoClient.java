
package multithreaded;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class MultiEchoClient {
    private  static InetAddress host;
    private static final  int port  = 1234;
    private static String s,resp;
    private static  Socket socket = null;

    
    public String getResp()
    {
      return  resp;
    }
    public void setMessage(String s)
    {
      this.s=s;
    }
     public Socket getsocket()
    {
      return  socket;
    }
   // Server_client_Muilt2 s = new  Server_client_Muilt2();
     public static void SendMessages() {
         
        try {
            socket = new Socket(InetAddress.getLocalHost(),1234);
            Scanner networkInput = new Scanner(socket.getInputStream());
            PrintWriter networkOutput = new PrintWriter(socket.getOutputStream(),true);
            networkOutput.println(s);
            
            resp = networkInput.nextLine();
            System.out.println(resp);
        }
        catch (IOException ec)
        {
            ec.printStackTrace();
        }
       
}
}