
package Ellipse;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class Serialization {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
        Student s1=new Student("Ali","Luxor", 20);
        FileOutputStream file1= new FileOutputStream("students.ser");
        ObjectOutputStream output = new ObjectOutputStream(file1);
        output.writeObject(s1);
        output.close();
        FileInputStream file2= new FileInputStream("students.ser");
        ObjectInputStream input=new ObjectInputStream(file2);
        Student s11=(Student) input.readObject();
        System.out.println("Student Name: "+s11.getName());
        System.out.println("Student Name: "+s11.getAddress());
        System.out.println("Student Name: "+s11.getAge());        
    }

    private static class Student implements Serializable{
        private  String Name;
        private  String Address;
        private  int Age;

        public Student(String name, String address, int age){
              this.Name=name; this.Address=address; this.Age=age;
        }
        public String getName(){ return this.Name;}
        public String getAddress(){ return this.Address;}
        public int getAge(){ return this.Age;}
        public void setName(String name){this.Name=name;}
        public void setAddress(String address){this.Address=address;}
        public void setAge(int age){this.Age=age;}
    
    }
}