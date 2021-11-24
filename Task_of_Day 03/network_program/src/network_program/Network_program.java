/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package network_program;

import java.io.IOException;
import java.net.InetAddress;
import java.util.Scanner;

/**
 *
 * @author Client
 */
public class Network_program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
          Scanner s =new Scanner(System.in);
        String host;
        System.out.println("enter host name:");
        host = s.next();
        
        InetAddress n;
        
        try{
            n = InetAddress.getByName(host);
            System.out.println(n.toString());
            System.out.println(InetAddress.getLocalHost());
            
        }
        catch(IOException ex){
            System.out.println("couldn't find "+host);
        }
    
     s.close();
    }
    
}
