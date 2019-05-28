package com.Test.base;

public class ThreadShunXu implements Runnable {

    public String thread;

    public ThreadShunXu(String thread) {
        this.thread = thread;
    }

    @Override
    public void run() {

        System.out.println(thread);


    }
}
