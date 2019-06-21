package com.thread.lock;

public class ThreadB extends Thread {


    private MyService ms;

    public ThreadB(MyService ms){
        this.ms=ms;
    }
    @Override
    public void run() {
       ms.methedC();
    }
}
