package com.local.xcode;

public class SingleEager {
    private static SingleEager SINGLE = new SingleEager();
    private SingleEager() {

    }
    public static SingleEager getInstance() {
        System.out.println("Object Created Eager....");
        return SINGLE;
    }
}
