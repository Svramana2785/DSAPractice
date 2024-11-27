package com.local.xcode;
public class Patterns {

    public static void main(String[] args) {
        int[][] a = {{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}};
        System.out.println(a.length);

        for(int i=0; i<a.length;i++) {
            for (int j=0; j<a.length; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
        int t = 4;
        for(int i=0; i<t; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i=0; i<t; i++) {
            for (int j = i; j<t; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i=0; i<t; i++) {
            for (int j=0; j<t; j++) {
                if(j<t-i-1)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }

        int x = -12345;
        int rev=0;
        while(x!=0){
            int last = x%10;
            x = x/10;
            rev = rev*10+last;
        }
        System.out.print(rev);
    }
}
