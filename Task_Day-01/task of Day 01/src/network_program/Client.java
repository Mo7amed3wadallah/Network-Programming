/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package network_program;

import java.io.*;
import java.io.EOFException;
import java.net.Socket;
import java.net.UnknownHostException;
import javax.swing.JOptionPane;
public class Client {
    private final String FILENAME = null;
    Connect c = new Connect();
    Socket socket;
    BufferedReader read;
    PrintWriter output;

    public void startClient() throws UnknownHostException, IOException{
        socket = new Socket(c.gethostName(), c.getPort());

        output = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));

        String username = JOptionPane.showInputDialog(null, "Enter User Name:");

        output.println(username);

        String password = JOptionPane.showInputDialog(null, "Enter Password");

        output.println(password);
        output.flush();

        read = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        String response = read.readLine();
        System.out.println("This is the response: " + response);

        JOptionPane.showMessageDialog(null, response);
    }

    public void fileInfo(){

    }

    public static void main(String args[]){
        Client client = new Client();
        try {
            client.startClient();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
