package com.local.xcode;

import java.util.Arrays;

public class NumMerge {
    public static void main(String[] args) {
        int a [] = {1,2,3,0,0,0};
        int b [] = {2,5,6};

        int m=3, n=3;
        int i = m-1, j = n-1, k = m+n-1;
        while (i>=0 && j>=0) {
            if (a[i] > b[j]){
                a[k] = a[i];
                i--;
            } else {
                a[k] = b[j];
                j--;
            }
            k--;
        }

        while(j>=0){
            a[k] = b[j];
            j--;
            k--;
        }
        Arrays.stream(a).forEach(System.out::print);
    }
}