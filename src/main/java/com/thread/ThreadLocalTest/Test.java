package com.thread.ThreadLocalTest;

public class Test {

    public static void main(String[] args) throws InterruptedException{
        ThreadA a=new ThreadA();
        a.start();
        ThreadB b=new ThreadB();
        b.start();
        for (int i = 0; i <5 ; i++) {
            ThreadLocal1.tl.set("main" + (i + 1));
            System.out.println("main get value" + ThreadLocal1.tl.get());
            Thread.sleep(200);
        }
    }
}
