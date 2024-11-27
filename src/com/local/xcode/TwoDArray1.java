package com.local.xcode;

import java.sql.SQLOutput;

public class TwoDArray1 {

    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[i].length; j++) {
                if (j<=arr[i].length-1-i) {
                    System.out.print(arr[i][j] + " ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[i].length; j++) {
                if (j>=arr[i].length-1-i) {
                    System.out.print(arr[i][j] + " ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<=i; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    /*
    i=0 len-1 = 4-1-i = 3
    i=1 len-1 = 4-1-i = 2
    i=2 len-1 = 4-1-i = 1
    i=3 len-1 = 4-1-i = 0
     */

}
