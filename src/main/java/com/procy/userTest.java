package com.procy;

public class userTest implements User {

    @Override
    public void sayHello(String arg) {
        System.out.printf("Hello,代理"+arg);
    }
}
