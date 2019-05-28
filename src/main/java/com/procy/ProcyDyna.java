package com.procy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*
* jdk1.3以后*/
public class ProcyDyna  implements InvocationHandler {

    private Object oj;

    /*通过反射来实例化对象*/
    public   Object bind(Object oj){
        this.oj=oj;
        return Proxy.newProxyInstance(
                this.oj.getClass().getClassLoader(),this.oj.getClass().getInterfaces(),this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result=null;
        logTest.start();
        /*通过反射来运行目标对象的方法*/
        result=method.invoke(this.oj,args);
        logTest.end();
        return result;
    }
}
