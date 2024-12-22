package com.local.xcode;

public class PalindromicSubs {

    public static void main(String[] args) {

        String s = "aaaabaaa";

        int n = s.length();
        int max = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; i++) {

                checkPolindrome(s, i, j, n);

            }
        }


    }

    private static void checkPolindrome(String s, int left, int right, int n) {

        while (left>=0 && right < n && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        if(right > left)
            System.out.println(s.substring(left+1, right));
    }


}
