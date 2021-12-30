
package multithreaded;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiEchoServer {
    private static ServerSocket serverSocket;
    private static final int port =1234;

    public static void main(String[] args) {
        try {
            serverSocket = new ServerSocket(port);
            do {
                Socket client =serverSocket.accept();
                System.out.println("New Client Accept");
                ClientHander h = new  ClientHander(client);
                h.start();
            }
            while (true);

        }
        catch (IOException ex)
        {
            ex.printStackTrace();
            System.exit(1);
        }

    }
    
}
