package com.local.xcode;

import javax.xml.transform.Source;

public class Recursion {

    public static void main(String[] args) {

        getRecursive(1);

    }

    private static void getRecursive(int i) {

        if (i == 10) {
            System.out.println("exit condition met");
            return;
        }
            if(i == 1)
                i++;
            getRecursive(10);
            getRecursive(10);

        System.out.println("first exit >>"+i);
    }

}
