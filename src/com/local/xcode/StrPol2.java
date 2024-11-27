package com.local.xcode;

public class StrPol2 {

    public static void main(String[] args) {
        String s = "cbbdf";
        if (s == null || s.length() < 2) {
            System.out.println("Pol " + s);
            return;
        }

        int maxLen = 1, start=0;

        for (int i=0;i<s.length();i++) {
            int len1 = expand(s,i,i);
            int len2 = expand(s, i , i+1);

            int len = Math.max(len1,len2);
            if(len>maxLen){
                maxLen = len;
                start = i-(len-1)/2;
            }
        }

        System.out.println("Final pol " + s.substring(start, start+maxLen));

    }

    public static int expand(String s, int left, int right ) {
        while (left > 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right-left-1;
    }
}