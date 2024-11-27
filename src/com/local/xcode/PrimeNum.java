package com.local.xcode;
public class PrimeNum {
    public static void main(String[] args) {
        System.out.println(isPrime(11));
    }


    public static boolean isPrime(int n) {
        if (n <=1)
            return true;
        for (int i=2; i<n; i++) {
            if(n%i == 0)
                return false;
        }
        return true;
    }
}