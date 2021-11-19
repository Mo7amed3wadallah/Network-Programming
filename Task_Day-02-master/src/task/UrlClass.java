/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

/**
 *
 * @author Client
 */
public class UrlClass {
    
    public static void main(String []args){
            Scanner sc =new Scanner(System.in);
            System.out.println("Enter a URL: ");
            String url =sc.nextLine();
            accessWebsite(url);
        
    }
    
    public static void accessWebsite(String url){
        BufferedReader br = null;
        try{
            URL myUrl =new URL(url);
            URLConnection urlConnection = myUrl.openConnection();
            InputStreamReader isr = new InputStreamReader(urlConnection.getInputStream());
            br = new BufferedReader(isr);
            
            String line;

            PrintStream o = new PrintStream(new File("output.html"));
  
            PrintStream console = System.out;
                             
            while((line = br.readLine()) != null){
                System.setOut(o);
                System.out.println(line);
            }
        }catch(IOException e){
            System.out.println("Cannot access URL");
            System.exit(1);
        }
        finally{
            System.out.println("Closing Connection..");
            try{
                br.close();
                System.exit(1);
            }catch(IOException e){
                e.printStackTrace();
            }
            
        }
    }
    
}
