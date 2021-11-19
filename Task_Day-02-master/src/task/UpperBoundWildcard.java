/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author Client
 */
public class UpperBoundWildcard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    //Upper Bounded Integer List 
    List < Integer > intList = Arrays.asList(10, 20, 30, 40);

    //printing the sum of integer elements in list 
    System.out.println("Total sum is:" + sum(intList));

    //Upper Bounded Double list 
    List < Double > doubleList = Arrays.asList(13.2, 15.6, 9.7, 22.5);

    //printing the sum of double elements in list 
    System.out.print("Total sum is: " + sum(doubleList));
  }
  private static double sum(List < ?extends Number > myList) {
    double sum = 0.0;
    for (Number iterator: myList) {
      sum = sum + iterator.doubleValue();
    }
    return sum;
  
    }

}