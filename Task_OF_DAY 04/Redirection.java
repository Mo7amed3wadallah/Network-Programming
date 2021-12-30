
package Ellipse;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;


public class Redirection {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        
            PrintStream console = System.out;
            BufferedInputStream in = new BufferedInputStream(new FileInputStream("file.java"));
            PrintStream out = new PrintStream(new BufferedOutputStream(new FileOutputStream("newfile.txt")));
            System.setIn(in);
            System.setOut(out);
            System.setErr(out);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s;
            while((s = br.readLine()) != null)
              System.out.println(s);
            out.close(); // Remember this!
            System.setOut(console);
    }
}