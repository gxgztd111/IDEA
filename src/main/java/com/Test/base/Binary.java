package com.Test.base;


/*
* 折半查找
* */
public class Binary {

    public static void main(String[] args) {

        int[] a={1,23,55,455,544,566,588,599,995,1000};
        System.out.printf("995所在的位置"+binary(a,995));
    }

    public static int binary(int[] a,int key){

        int low,high,mid;

            low=1;
            high=a.length-1;


        while (low<=high){
            mid=((low+high)/2);
           if(key<a[mid]){
               high=mid-1;
           }else if(key>a[mid]){
               low=mid+1;
           }else{
               return mid;
           }
        }
        return 0;

    }

}
