package com.thread.ThreadLocalTest;

public class ThreadLocal1 {
    public static ThreadLocal tl=new ThreadLocal();

    public static void main(String[] args) {
        if(tl.get()==null){
            System.out.println("从来没有放过值");
            tl.set("我放入的值");
        }
        System.out.println(tl.get());
        System.out.println(tl.get());
    }
}
