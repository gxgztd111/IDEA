package com.Test.base;

public class Test0426 {
    /*
    * a  instanceof  b
    * 如果 object 是 class 的一个实例，则 instanceof 运算符返回 true。如果 object 不是指定类的一个实例，或者 object 是 null，则返回 false。

     但是instanceof在Java的编译状态和运行状态是有区别的：

在编译状态中，class可以是object对象的父类，自身类，子类。在这三种情况下Java编译时不会报错。

在运行转态中，class可以是object对象的父类，自身类，不能是子类。在前两种情况下result的结果为true，最后一种为false。但是class为子类时编译不会报错。运行结果为false。
    a ^ b
       真真异或为假    二进制  同位置相同为0 不同为1
    * */
    public static void main(String[] args) {
        Test3 test3 = new Test3();
        Integer integer = new Integer(2);
        boolean a = integer instanceof Object;
        boolean b = test3 instanceof Object;
        test3.add();
        System.out.println(a ^ b);
    }
}

abstract class Test2 {
    abstract void add();
}

class Test3 extends Test2 {
    @Override
    void add() {
        int i = 1;
        try {
            i = 3;
        } finally {
            i++;
            System.out.print(i + " ");
        }
    }
}
