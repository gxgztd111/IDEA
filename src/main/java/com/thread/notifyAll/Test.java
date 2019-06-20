package com.thread.notifyAll;

public class Test {

    public static void main(String[] args) throws InterruptedException{
        MyList list=new MyList();
        ThreadA a=new ThreadA(list);
        a.setName("a");
        a.start();
        Thread.sleep(300);
        ThreadB b=new ThreadB(list);
        b.setName("b");
        b.start();

    }
}
