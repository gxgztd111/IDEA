package com.thread;

public class ThreadTwo extends Thread {

    private PublicNumber pn;
    public ThreadTwo(PublicNumber pn){
        this.pn=pn;
    }
    @Override
    public void run() {
       /* super.run();
        System.out.println("Two线程的优先级 "+ Thread.currentThread().getPriority());*/
        for (int i = 0; i <50 ; i++) {
            pn.add("b");
        }
    }
}
