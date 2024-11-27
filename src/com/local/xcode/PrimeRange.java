package com.local.xcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeRange {

    public static void main(String[] args) {
        int i =100;
        System.out.println(getPrimes(i));
    }

    public static List<Integer> getPrimes(int n) {
        List<Integer> nums = new ArrayList<>();
        boolean stat = true;
        for (int i=2;i<n;i++) {
            stat = true;
            for (int j=2;j<i;j++) {
                if(i%j == 0) {
                    stat = false;
                    break;
                }
            }
            if(stat)
                nums.add(i);
        }
        return nums;
    }
}