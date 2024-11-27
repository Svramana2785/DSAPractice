package com.local.xcode;

import java.util.Arrays;

public class Find3Large {

    public static void main(String[] args) {
        int[] a = {4, 2, 1, 7, 7, 8, 1, 9};
        int[] aa = new int[3];

        for (int i = 0; i < a.length; i++) {
            int k = 2;
            while (k >= 0) {
                System.out.println("K val " +k);
                if (aa[k] < a[i]) {
                    int tmp = aa[k];
                    aa[k] = a[i];
                    aa[--k] = tmp;
                    for (int l=k ; l>0 ; l--) {
                        int temp = aa[l];
                        System.out.println(" last element " +temp);
                    }
                    break;
                } else {
                    k--;
                }
            }
        }
        System.out.println(Arrays.toString(aa));
    }
}