package com.local.xcode;

import java.util.Arrays;

public class Bubble2 {

    public static void main(String[] args) {

        int[] arr = {1,5,3,5,7,8,9,3,2,4,5,6,7,8,9,0};
        Arrays.stream(arr).forEach(System.out::print);
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        Arrays.stream(arr).forEach(System.out::print);
    }

}
