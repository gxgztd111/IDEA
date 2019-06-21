package com.thread.lock;

public class ThreadA  extends  Thread {

    private MyService ms;

    public  ThreadA( MyService ms){

        this.ms=ms;
    }

    @Override
    public void run() {
       /* ms.testMethed();*/
        ms.methedA();

    }



    public static void main(String[] args) throws InterruptedException{
        MyService ms=new MyService();
       /* ThreadA a1=new ThreadA(ms);
        ThreadA a2=new ThreadA(ms);
        ThreadA a3=new ThreadA(ms);
        ThreadA a4=new ThreadA(ms);
        ThreadA a5=new ThreadA(ms);
        a1.start();
        a2.start();
        a3.start();
        a4.start();
        a5.start();*/


        ThreadA aa=new ThreadA(ms);
        aa.setName("a");
        aa.start();
        ThreadB b=new ThreadB(ms);
        b.setName("b");
        b.start();
        Thread.sleep(3000);
        ms.methedD();
    }
}
