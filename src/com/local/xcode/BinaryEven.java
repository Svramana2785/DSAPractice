package com.local.xcode;

public class BinaryEven {

    public static void main(String[] args) {

        for(int i=0; i<1000; i++) {
            if(i%2 != 0) {
                genBin(i);
                System.out.println();
            }
        }

        int x = 2;
        int xx = (1<<x)-1;
        genBin(xx);
        System.out.println(xx);
        genBin(xx<<4);
        System.out.println();
        System.out.println(xx<<4);
    }

    private static void genBin(int i) {
        if(i==0)
            return;
        genBin(i/2);
        System.out.print(i%2);

    }

}
