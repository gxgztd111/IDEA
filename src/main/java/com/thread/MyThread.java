package com.thread;

public class MyThread extends Thread {

    @Override
    public void run() {
        super.run();

        try {
            for (int i = 0; i < 100000; i++) {
                if (this.interrupted()) {
                    System.out.println("执行中断 " + i);
                    throw new InterruptedException();
                }
                System.out.println("i= " + i);

            }
            System.out.println("我是for循环之后的代码");
        }catch (InterruptedException e){
            System.out.println("异常退出");
            e.printStackTrace();
        }


    }
}
