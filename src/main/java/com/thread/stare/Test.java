package com.thread.stare;

public class Test {

    public static void main(String[] args) {
        Stare ss=new Stare();
        for (int i = 0; i <20 ; i++) {
            ThreadC tc=new ThreadC(ss);
            ThreadP tp=new ThreadP(ss);
            tp.start();
            tc.start();
        }

    }
}
