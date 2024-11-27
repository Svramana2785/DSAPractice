package com.local.xcode;

public class ThreadRun {

    public static void main(String[] args) {


        Runnable r = () -> {
            System.out.println("Thread running.....");
        };

        new Thread(r).start();
    }

}
