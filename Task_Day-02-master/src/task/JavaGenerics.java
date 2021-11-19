/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task;

import sun.applet.Main;

/**
 *
 * @author Client
 */
public class JavaGenerics {
    public static void main(String []args){
     
        Integer[] intArray={1,2,3,4,5};
        Double [] doubleArray={1.1,2.2,3.3,4.4,5.5};
        Character [] charArray = {'M' , 'O' , 'H' , 'A' , 'M' , 'E' , 'D'};
        
        System.out.print("\nOutput Integer Array:");
        Display(intArray);
        
        System.out.print("\nOutput Double Array:");
        Display(doubleArray);
        
        System.out.print("\nOutput Character Array:");
        Display(charArray);
        
    }  
    
    public static <G> void Display(G[] array){
        
        for(G element : array){
            System.out.print( element+",");
        }
        System.out.println();
    }
        
    }

