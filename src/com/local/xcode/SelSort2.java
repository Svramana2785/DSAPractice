package com.local.xcode;

import java.util.Arrays;

public class SelSort2 {

    public static void main(String[] args) {

        int[] arr = {1,5,3,5,7,8,9,3,2,4,5,6,7,8,9,0};

        for (int i=0;i<arr.length-1;i++) {
            System.out.println("-->" +arr[i]);
            for(int j=i+1;j<arr.length;j++){
                int min = i;
                if (arr[j] > arr[min]) {
                    min = j;
                }
                int temp = arr[min];
                arr[min] = arr[j];
                arr[j] = temp;
            }
        }

        Arrays.stream(arr).forEach(System.out::print);
    }
}
