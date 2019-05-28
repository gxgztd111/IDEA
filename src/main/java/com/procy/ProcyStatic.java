package com.procy;

/*
* 静态代理重点在与 代理对象要和目标对象实现相同的接口,并且持有目标对象的引用*/
public class ProcyStatic implements User{
    userTest ut;
    public ProcyStatic(userTest ut){
        super();
        this.ut=ut;
    }
    @Override
    public void sayHello(String arg) {

        logTest.start();
        ut.sayHello(arg);
        logTest.end();
    }
}
