package com.local.xcode;

import java.util.Arrays;

public class RotateArr {

    public static void main(String[] args) {

        int[] a = {1,2,3,4,7,8,4,3,2,6,8,3,2,1,6,7,8};
        int[] aa = new int[a.length];

        for (int i=a.length-1; i>0 ; i--) {
            System.out.print(a[i] + " ");
            int curr = i;
            int temp = a[i];
            aa[--curr] = temp;
        }
        int k = 5;
        for (int j=a.length-1; j>a.length-2; j--) {
            aa[j] = a[--k];
        }

        System.out.println(Arrays.toString(aa));
    }

}
