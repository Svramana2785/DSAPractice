package com.local.xcode;

import java.util.Arrays;

public class BubbleSortJa {

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 3};
        Arrays.stream(arr).forEach(System.out::print);
        for (int i=0;i<arr.length-1;i++) {
            for (int j=0;j<arr.length-1;j++) {
                if( arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        Arrays.stream(arr).forEach(System.out::print);
    }
}