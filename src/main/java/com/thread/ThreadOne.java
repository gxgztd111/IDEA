package com.thread;

public class ThreadOne extends Thread {

    private PublicNumber pn;
    public ThreadOne( ){

    }
    public ThreadOne(PublicNumber pn){
        this.pn=pn;
    }
    @Override
    public void run() {
       /* super.run();
        ThreadTwo tt=new ThreadTwo();
        tt.start();
        System.out.println("One线程的优先级 "+ Thread.currentThread().getPriority());*/
        for (int i = 0; i <50 ; i++) {
            pn.add("a");
        }
       /* while (true){
            print();
        }*/

     }
    public  synchronized void print(){
        System.out.println("print1 "+Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ThreadOne TO1=new ThreadOne();
        ThreadOne TO2=new ThreadOne();
        TO1.start();
        TO2.start();

    }
}
