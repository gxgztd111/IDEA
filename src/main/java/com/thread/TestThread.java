package com.thread;

import org.omg.PortableServer.THREAD_POLICY_ID;

public class TestThread {
    public static void main(String[] args) throws  InterruptedException {

      /*  //测试interrupted的第二次清除中断状态  isInterrupted不清除状态
        System.out.println("线程是否停止1 "+Thread.interrupted());
        System.out.println("线程是否停止2 "+Thread.interrupted());
        System.out.println("线程是否停止1 "+Thread.currentThread().isInterrupted());
        System.out.println("线程是否停止2 "+Thread.currentThread().isInterrupted());*/
     /* //测试interrupt 通过抛异常停止线程
      try{
           MyThread mt=new MyThread();
           mt.start();
           Thread.sleep(1000);
           mt.interrupt();
       }catch (InterruptedException e){
           System.out.println("main catch");
           e.printStackTrace();
       }*/

       /*//测试线程的优先级  优先级是可以设置的,优先级是分配更多偶的资源
        ThreadOne to=new ThreadOne();
        to.start();
        System.out.println("mian 线程的优先级 "+ Thread.currentThread().getPriority());*/

         //PublicNumber 不加锁 会造成数据的脏读,当加上锁之后方法同步不会出现此问题
        PublicNumber pn=new PublicNumber();
        ThreadOne to=new ThreadOne(pn);
        to.start();
        /*//在同时调用PublicNumber的同步方法时,能保证调用整个方法是同步的,不会出现数据的脏读,
           //但是不能保证两个线程顺序执行,join方法可以保证顺序执行
        to.join();*/
        ThreadTwo tw=new ThreadTwo(pn);
        tw.start();

       //可重入锁,当获得某个实例的锁时,可以访问这个对象的其他同步方法,也可以访问这个类的父类的同步方法
        // 同步不允许继承


    }
}
