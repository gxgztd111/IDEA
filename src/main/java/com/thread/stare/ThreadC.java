package com.thread.stare;

import com.thread.entity.C;

public class ThreadC extends Thread{

    private Stare ss;
    public ThreadC(Stare ss){
        this.ss=ss;
    }
    @Override
    public void run() {
        ss.printA();
    }
}
