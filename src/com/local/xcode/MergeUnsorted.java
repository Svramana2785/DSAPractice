package com.local.xcode;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Arrays;
public class MergeUnsorted {
    public static void main(String[] args) {

        int a[] = { 10, 5, 15 };
        int b[] = { 20, 3, 2, 12 };
        int n = a.length;
        int m = b.length;
        int res[] = new int[m+n];
        System.out.println("m "+m +"n "+n + " res "+ res.length);
        int i = 0, k=m+n;
        int half = n;
        int first = 0;
        int bi = 0;
        while (k>=0) {
            if(first < n) {
                res[first] = a[i];
                first++;
                i++;
            }
            if(half<res.length) {
                res[half] = b[bi];
                half++;
                bi++;
            }
            k--;
            System.out.println("half " +half);
        }
        Arrays.stream(res).forEach(System.out::println);
    }
}