package com.Test.base;

public class SuShu {

    public static void main(String[] args) {
        //System.out.println(sum(100,10));

    }

    /*统计一个区间内素数个数*/
    public static int sum(int start,int end){
        int count=0;
        if (start==end||start<0||end<0){
            System.out.println("错误区间 :"+start+""+end);
            return 0;
        }else if(start>end){
            int emp=0;
            emp=end;
            end=start;
            start=emp;
            System.out.println("区间进行调换");
        }
        for (int i =start; i <=end ; i++) {
             if (isPrime(start)){
                 count++;
                 System.out.print(start+" ");
                  //输出10个数之后换行
                 if(count%10==0){
                     System.out.println();
                 }
             }
             start++;
        }
        System.out.println();
        return count;
    }

    /*判断是否为素数*/
    public static boolean isPrime(int m){
        boolean flage=true;
        if (m==1||m==0){
            return false;
        }else{

            for (int i =2; i <=Math.sqrt(m) ; i++) {
                if(m%i==0){
                    flage=false;
                    break;
                }else{
                    flage=true;
                }
            }
        }

        return flage;
    }
}
