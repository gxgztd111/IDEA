package com.Test.base;


import java.util.Arrays;

public class TestSort {
    public static void main(String[] args) {
        int[] a={1,8,5,4,9,6,11};
        for (int aa:a) {
            System.out.printf(aa+" ");
        }
        Arrays.sort(a);
        System.out.println("");
        for (int aa:a) {
            System.out.printf(aa+" ");
        }
    }
}
