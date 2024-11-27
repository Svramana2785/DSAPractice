package com.local.xcode;

public class CheckPoln {

    public static void main(String[] args) {
        String s = "babad";
        int n = s.length();
        int maxlen = 1, start = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if(checkPal(s,i,j) && (j-i+1)>maxlen){
                    start = i;
                    maxlen = j-i+1;
                }
            }
        }

        System.out.println(s.substring(start, start+maxlen));
    }

    public static boolean checkPal(String s, int low, int high) {
        while (low<high) {
            if (s.charAt(low)!=s.charAt(high))
                return false;
            low++;
            high--;
        }
        return true;
    }
}