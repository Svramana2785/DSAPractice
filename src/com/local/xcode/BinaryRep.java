package com.local.xcode;

public class BinaryRep {

    public static void main(String[] args) {

        int n = 2147483647;
        System.out.print("using rec ::");
        bin(n);
        System.out.println();
        System.out.print("using while :: ");
        StringBuilder sb = new StringBuilder();
        while(n>0) {
            //System.out.print(n%2);
            sb.append(n%2);
            n/=2;
        }

        System.out.println("x "+sb.reverse());
        System.out.println("Flipped zero "+ Integer.MAX_VALUE);
        System.out.println("Flipped zero "+ Integer.MIN_VALUE);
        System.out.println("not 0 > "+ ~0);
    }

    private static void bin(int n) {
        if(n==0) return;
        bin(n/2);
        System.out.print(n%2);
        System.out.println(">> " +n);
    }



}
