package com.Test.base;

public class GCTest {

    public static void main(String[] args) {
        byte[] bt;
        for (int i = 0; i < 100; i++) {
            bt=new byte[1*1024*1024];
        }
       // System.gc();
    }
}
