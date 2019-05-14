package com.Test.base;

public class Lengh {
    public static void main(String[] args) {
        double[] result=SumLength(100,7);
    }

    public  static double[] SumLength(double h,int number){
        double sum=0;
        for (int i = 0; i <number ; i++) {
            sum +=h;
            h /=2.0;
        }
        System.out.printf("第"+number+"次弹起的高度为:"+h+"; 一共经过的路程为:"+sum);
        double[] result={sum,h};
        return result;
    }
}
