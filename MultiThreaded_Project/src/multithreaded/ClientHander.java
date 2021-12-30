
package multithreaded;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientHander extends Thread{
    public Socket client;
    private Scanner input;
    private PrintWriter output;
    public ClientHander(Socket client)
    {
        this.client =client;
        try {
            input  = new Scanner(client.getInputStream());
            output = new PrintWriter(client.getOutputStream(),true);

        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
    }
    public  void run(){
        String Recive;
        do {
            Recive = input.nextLine();
            output.println("ECHO  : "+Recive  );
        }
        while (!Recive.equals("Close"));
        try {
            if(client!=null)
            {
                System.out.println("Closing Down Connection");
                client.close();
            }

        }
        catch (IOException ex)
        {
            System.out.println("Unable to disconnect!");
        }

    }
    
}
