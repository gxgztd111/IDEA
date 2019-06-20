package com.thread.stare;

import com.thread.entity.P;

public class ThreadP  extends Thread{
    private Stare ss;
    public ThreadP(Stare ss){
        this.ss=ss;
    }
    @Override
    public void run() {
        ss.printB();
    }
}
