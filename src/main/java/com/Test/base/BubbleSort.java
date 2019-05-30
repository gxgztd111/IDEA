package com.Test.base;

public class BubbleSort {

        public static void sortright(int[] a){

            boolean flag=true;
            for (int i = 0; i <a.length && flag; i++) {

                flag=false;
                for (int j =  a.length-2; j >=i; j--) {

                    if (a[j]>a[j+1]){
                        int tamp=a[j+1];
                        a[j+1]=a[j];
                        a[j]=tamp;
                        flag=true;
                    }
                }
            }
        }

        public static void sortleft(int[] a){

            for (int i = 0; i < a.length; i++) {

                for (int j = 0; j <a.length-i-1; j++) {

                    if(a[j]>a[j+1]){
                        int tamp=a[j];
                        a[j]=a[j+1];
                        a[j+1]=tamp;
                    }
                }
            }
        }
    public static void main(String[] args) {
        int[] a={3,4,5,8,1,4,5,22,45,4,1,158,8,411,14};
        for (int aa:a
        ) {
            System.out.printf(aa+" ");
        }
        System.out.println();
        long starttime=System.currentTimeMillis();
        sortleft(a);
        long time=System.currentTimeMillis()-starttime;
        System.out.printf(time+"");
        System.out.println();
        for (int aa:a
             ) {
            System.out.printf(aa+" ");
        }

    }
}
