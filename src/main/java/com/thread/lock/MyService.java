package com.thread.lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {

     private Lock lock =new ReentrantLock();
     private Condition condition=lock.newCondition();
    private Condition conditionC=lock.newCondition();
     public  void  testMethed(){

         lock.lock();
         for (int i = 0; i <5 ; i++) {

             System.out.println("Thread -- "+Thread.currentThread().getName() + ( " " + (i+1)));

         }
         lock.unlock();

     }

     public void methedA(){

         try{
             lock.lock();
             System.out.println("我锁住了， 输出 "+Thread.currentThread().getName());
             condition.await();
             System.out.println("谁唤醒了我 "+Thread.currentThread().getName());

         }catch (InterruptedException ie){
             ie.printStackTrace();
         }finally {
             lock.unlock();
         }
     }
    public void methedC(){

        try{
            lock.lock();
            System.out.println("我锁住了， 输出C");
            conditionC.await();
            System.out.println("谁唤醒了我C");

        }catch (InterruptedException ie){
            ie.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

     public void methedB(){
         try{
             lock.lock();
             System.out.println("我拿到了锁B");
             condition.signalAll();
             System.out.println("开始通知全部");
         }finally {
             lock.unlock();
         }
     }
    public void methedD(){
        try{
            lock.lock();
            System.out.println("我拿到了锁D");
            conditionC.signalAll();
            System.out.println("开始通知C");
        }finally {
            lock.unlock();
        }
    }



}
