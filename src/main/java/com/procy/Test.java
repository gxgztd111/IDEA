package com.procy;

public class Test {
    public static void main(String[] args) {
   /*静态代理的调用*/
    /*    User user=new ProcyStatic(new userTest());
        user.sayHello("是子类吗");*/
    /*动态代理的调用*/
        User user=(User) new ProcyDyna().bind(new userTest());
        user.sayHello("动态代理");
    }
}
