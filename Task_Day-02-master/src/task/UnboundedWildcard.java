/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task;


import java.util. * ;
public class UnboundedWildcard {
  public static void main(String[] args) {
    //Integer List 
    List < Integer > intList = Arrays.asList(10, 20, 30, 40);
    //Double list 
    List < Double > doubleList = Arrays.asList(11.5, 13.6, 67.8, 43.7);
    printList(intList);
    printList(doubleList);
  }
  private static void printList(List < ?>list) {
    System.out.println(list);
  }
}