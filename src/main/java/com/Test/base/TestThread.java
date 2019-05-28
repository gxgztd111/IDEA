package com.Test.base;

public class TestThread {
    public static void main(String[] args) {

        try {
            Object lock=new Object();

            Thread a=new Thread(new ThreadA(lock));
            a.start();
            a.sleep(50);
            Thread b=new Thread(new ThreadB(lock));
            b.start();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
