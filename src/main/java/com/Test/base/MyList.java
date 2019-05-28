package com.Test.base;

import java.util.ArrayList;
import java.util.List;

public class MyList {

    private static List<String> list=new ArrayList<String>();

    public static void add(){
        list.add("aaa");
    }
    public static int size(){
        return list.size();
    }
}
