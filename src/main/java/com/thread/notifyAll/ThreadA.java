package com.thread.notifyAll;

public class ThreadA extends Thread {

    private Object lock;

    public ThreadA(Object lock){
        super();
        this.lock=lock;
    }


    @Override
    public void run() {

        try{
            synchronized (lock) {
                if (MyList.size() != 5) {
                    System.out.println("A start " + System.currentTimeMillis());
                    lock.wait();
                    System.out.println("A end " + System.currentTimeMillis());
                }
            }
        }catch (InterruptedException E){
              E.printStackTrace();
        }
    }
}
