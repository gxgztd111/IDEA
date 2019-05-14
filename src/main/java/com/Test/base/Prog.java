package com.Test.base;

public class Prog {
    public static void main(String[] args) {
             comBination();
    }

    public static int comBination(){
        int count=0;
        int n=0;
        for (int i = 1; i <5 ; i++) {
            for (int j = 1; j <5 ; j++) {
                if (i==j)continue;
                for (int k = 1; k <5 ; k++) {
                   if (i==k||j==k){
                       continue;
                   }else {
                       n = i * 100 + j * 10 + k;
                   }
                    System.out.print(n+" ");
                   if(++count%5==0){
                       System.out.println();
                   }
                }
            }
        }

        return 0;
    }
}
