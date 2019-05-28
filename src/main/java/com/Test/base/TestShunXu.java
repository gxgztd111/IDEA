package com.Test.base;

import java.util.concurrent.*;

public class TestShunXu  {

    public static ExecutorService es=Executors.newSingleThreadExecutor();
    public static void main(String[] args) throws InterruptedException{
        TestShunXu ts=new TestShunXu();
        Thread a=new Thread(new ThreadShunXu("a"));
        Thread b=new Thread(new Theradb());
        Thread c=new Thread(new Theradc());
        a.start();
        a.join( );
        b.start();
        b.join();
        c.start();
        es.submit(b);
        es.submit(c);
        es.submit(a);
        es.shutdown();


    }
    static class Theradb implements Runnable {

        @Override
        public void run() {
            System.out.println("threadb");
        }
    }
    static class  Theradc implements Runnable {

        @Override
        public void run() {
            System.out.println("threadc");
        }
    }
}

