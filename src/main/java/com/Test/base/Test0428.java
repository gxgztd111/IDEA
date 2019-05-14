package com.Test.base;


public class Test0428 {
    public static void main(String[] args) {
        Add add = new Add();
        ThreadFun thread1 = new ThreadFun(add);
        ThreadFun thread2 = new ThreadFun(add);
        ThreadFun thread3 = new ThreadFun(add);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class ThreadFun extends Thread{
    private Add add;
    ThreadFun(Add add){
        this.add = add;
    }
    public void run(){
        synchronized (add){
            add.add();
        }
    }
}

class Add{
    private int num1;
    int num2;
    void add(){
        num1 += 3;
        num2 += 3;
        System.out.print(num1 + " " + num2);
    }
}
