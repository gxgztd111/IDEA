package com.Test.base;

public class QuickSort {

    public static void init(int[] a){
        quicksort(a,0,a.length-1);
    }
    public static void quicksort(int[] a,int low,int high){

        int tmp,i,j;
        if(low>high){
            return;
        }
        tmp=a[low];
        i=low;
        j=high;

        while(i<j){
            while (tmp<=a[j]&&i<j){
                j--;
            }
            while (tmp>=a[i]&&i<j){
                i++;
            }
            if(i<j){
                int aa=a[j];
                a[j]=a[i];
                a[i]=aa;
            }
        }
        a[low]=a[i];
        a[i]=tmp;

        quicksort(a, low, j-1);
        quicksort(a, i+1, high);
    }

    public static void main(String[] args) {
        int a[]={44,5,8,45,56,12,88,99,51,49,98,97,82,98,145,852,11,22,33,5,2,0,44};
        init(a);
        for (int aa:a) {
            System.out.printf(aa+" ");
        }
    }
}
