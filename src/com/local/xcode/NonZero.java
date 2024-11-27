package com.local.xcode;

import java.util.Arrays;

public class NonZero {

    public static void main(String[] args) {
        int [] a = {0,1,0,3,0,12,0,1};
        int zero =0, nzero = 0;

        for (int i=0;i<a.length;i++) {
            System.out.println("i -> " + a[i]);
            if (a[nzero] != 0) {
                int temp = a[nzero];
                a[nzero] = a[zero];
                a[zero] = temp;
                zero++;
            }
            nzero++;
        }
        Arrays.stream(a).forEach(System.out::print);
    }
}