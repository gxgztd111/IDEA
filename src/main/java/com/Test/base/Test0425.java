package com.Test.base;

public class Test0425 {

    static {
        int i = 5;
    }

    private static int i, j;
/*
i++为执行完当前语句后再+1

++i为先+1再执行当前语句

局部变量可以与成员变量同名，同名局部变量的修改不会影响成员变量
*/
    public static void main(String[] args) {
        i--;
        add();
        System.out.println(i + j + ++i);
    }

    private static void add() {
        j = i++ + ++i;
    }


}
