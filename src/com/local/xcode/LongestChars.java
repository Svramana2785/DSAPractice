package com.local.xcode;

import java.util.HashSet;
import java.util.Set;
public class LongestChars {
    public static void main(String[] args) {
        String s = "GEEKSFORGEEKS";
        int n = s.length();
        boolean chars [] = new boolean[256];
        int longest = 0;
        int start = 0;
        for (int i=0;i<=n;i++) {
            int curr = 0;
            for (int j=i;j<n;j++) {
                if (chars[s.charAt(j)]) {
                    curr = j;
                    break;
                } else {
                    chars[s.charAt(j)] = true;
                }
            }
            System.out.println("curr" + curr +" long " + longest);
            if ( longest < curr-i+1) {
                start = i;
                longest = curr-i+1;
            }
        }
        System.out.println(" Longest --> " + longest);
        System.out.println("the string " + s.substring(start,start+longest));
    }
}