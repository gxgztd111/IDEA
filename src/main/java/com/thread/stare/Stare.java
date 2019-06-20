package com.thread.stare;

public class Stare {
    volatile private  boolean flag=false;
    synchronized public void printA(){
        try{
            while (flag==true){
                wait();
            }
            for (int i = 0; i <5 ; i++) {
                System.out.println("* * * * *");
            }
            flag=true;
            notifyAll();
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }
    }
    synchronized public void printB(){
        try{
            while (flag==false){
                wait();
            }
            for (int i = 0; i <5 ; i++) {
                System.out.println("# # # # #");
            }
            flag=false;
            notifyAll();
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }
    }
}
