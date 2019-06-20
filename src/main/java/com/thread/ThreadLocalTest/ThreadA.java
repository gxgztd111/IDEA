package com.thread.ThreadLocalTest;

import com.thread.notifyAll.MyList;

public class ThreadA extends Thread {




    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                ThreadLocal1.tl.set("ThredA" + (i + 1));
                System.out.println("ThreadA get value" + ThreadLocal1.tl.get());
                Thread.sleep(200);
            }
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }

    }
}
