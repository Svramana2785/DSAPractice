package com.local.xcode;

public class HalfDiamond {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named interview.Main. */



        int t = 5;

        for (int i=0; i<t; i++) {
            for (int j=0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i=t; i>0; i--) {
            for (int j=i; j>1; j--) {
                System.out.print("*");
            }
            if (i!=1)
                System.out.println();
        }


    }
}