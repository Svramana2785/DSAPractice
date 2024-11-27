package com.local.xcode;

public class StrPol {

    public static void main(String[] args) {

        String s = "babad";

        int n = s.length();
        int maxLen=1,start=0;

        for (int i=0;i<n;i++) {
            for (int j=i;j<n;j++) {
                if (check(s, i , j) && (j-i+1)>maxLen) {
                   start = i;
                   maxLen = j-i+1;
                }
            }
        }
        System.out.println(s.substring(start, start+maxLen));
    }

    public static boolean check(String s, int low , int high) {
        while (low<high) {
            if (s.charAt(low) != s.charAt(high)) {
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
}