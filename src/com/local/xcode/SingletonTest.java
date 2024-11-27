package com.local.xcode;

public class SingletonTest {
    public static void main(String[] args) {
        SingleLazy.getInstance();
        SingleEager.getInstance();
    }
}
