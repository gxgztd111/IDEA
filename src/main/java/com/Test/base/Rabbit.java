package com.Test.base;

public class Rabbit {

    public static void main(String[] args) {

        System.out.printf(fun2(9)+"");
    }


    /*
    * 计算兔子数列,使用递归,此方法重复调用自身,到最后长生大量的重复数据,时间复杂度较高对于斐波那契数列来说
    * 影响性能,*/
    public static int fun(int n){
        if(n==0){
            System.out.printf("请勿输入0");
            return 0;
        }
        if(n==1||n==2){
            return n;
        }
        return fun(n-1)+fun(n-2);
    }

    /*
    * 从下往上推,时间复杂度较低, */
    public static int fun2(int n){
        if(n==1||n==2){
            return 1;
        }
        //上个月的数量
        int last=1;
        //当月的数量
        int current=1;
        //总数
        int emp=0;
        for (int i = 3; i <=n ; i++) {
            //总数等于当月加上月
            emp=current+last;
            last=current;
            current=emp;
        }
        return emp;
    }
}
