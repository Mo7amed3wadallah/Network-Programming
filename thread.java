/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package network_program;

/**
 *
 * @author Client
 */

public class thread{
 public static void main(String[] args) {
     hello h =new hello();
     message msg =new message();
     num n =new num();
     h.start();
     msg.start();
     n.start();
 
 }
}

 class hello extends Thread{
    @Override
    public  void run(){
        int p;
        for(int i=0;i<5;i++){
            try{
                System.out.println("Hello");
                
                sleep(3000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    } 
}

class num extends Thread{
    @Override
    public void run(){
        int p;
        for(int i=0;i<5;i++){
            try{
            System.out.println(i);
            p = (int)(Math.random()*3000);
            sleep(p);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

class message extends Thread{
  
    @Override
    public void run(){
        for(int i=0;i<5;i++){
            try{System.out.println("mohamed");
            
            sleep(3000);}catch(InterruptedException e){
            System.out.println(e);
        }
        }
    }
}