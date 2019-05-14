package com.Test.base;

public class Test0424 extends Thread {

    /*
    * Thread类中有默认的run方法和start方法，可以对相应的方法进行重写子类可以调用父类中已有的方法。
    * 不重写run方法,只重写start,start方法不会执行
    */
    public static void main(String[] args) {
        Test0424 test = new Test0424();
        test.run();
    }

    @Override
    public void run() {
        super.run();
        Test0424 test = new Test0424();
        test.start();
    }

    public void start() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Value of i = " +i);
        }
    }
}
