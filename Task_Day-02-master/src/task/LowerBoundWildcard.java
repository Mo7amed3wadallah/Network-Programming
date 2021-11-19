
package task;

import java.util. * ;

public class LowerBoundWildcard {

    public static void main(String[] args) {
    //Lower Bounded Integer List 
    List < Integer > intList = Arrays.asList(10, 20, 30, 40);
    //Passing Integer list object 
    printOnlyIntegerClassorSuperClass(intList);
    //Number list 
    List < Number > numberList = Arrays.asList(10, 20, 30, 40);
    //Passing Integer list object 
    printOnlyIntegerClassorSuperClass(numberList);
  }
  public static void printOnlyIntegerClassorSuperClass(List < ?super Integer > list) {
    System.out.println(list);
  }
}