package com.local.xcode;

public class ClsB extends ClsA {

    public void fun(String a) throws Exception{
        System.out.println("from child");
    }

    public void fun(Integer s) {
        System.out.println("Integer ... ");
    }

    public static void main(String[] args)  {
        try {
            new ClsB().fun("123");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
