package com.local.xcode;

import java.util.Arrays;

public class SelectionSrt {

    public static void main(String[] args) {

        int[] arr = {1,5,3,5,7,8,9,3,2,4,5,6,7,8,9,0};
        Arrays.stream(arr).forEach(System.out::print);
        for (int i=0; i<arr.length-1; i++) {
            int min = i;
            for (int j=i+1; j<arr.length; j++) {
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        Arrays.stream(arr).forEach(System.out::print);
    }

}
