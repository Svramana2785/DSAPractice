package com.local.xcode;

import java.util.HashSet;
import java.util.Set;

public class Largestsubst {
    public static void main(String[] args) {
        String s = "AAABCDAA";
        int n = s.length();
        Set<Character> st = new HashSet<>();
        int longest = 0;
        int start = 0;
        for (int i=0;i<=n;i++) {
            int curr = 0;
            st = new HashSet<>();
            for (int j=i;j<n;j++) {
                if (st.contains(s.charAt(j))) {
                    curr = j;
                    break;
                } else {
                    st.add(s.charAt(j));
                }
            }
            System.out.println("curr" + curr +" long " + longest);
            if ( longest < curr-i) {
                start = i;
                longest = curr-i;
            }
        }
        System.out.println(" Longest --> " + longest);
        System.out.println("the string " + s.substring(start,start+longest));
    }
}