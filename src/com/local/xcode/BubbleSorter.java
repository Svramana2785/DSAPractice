package com.local.xcode;

import java.util.Arrays;

public class BubbleSorter {

    public static void main(String[] args) {

        int [] a = {5,8,10,15,3,6};

        for (int i=0; i<a.length-1;i++) {
            for (int j=0; j<a.length-i-1; j++) {
                if (a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }

        Arrays.stream(a).forEach(System.out::print);
    }
}