package com.local.xcode;

import java.util.Scanner;

public class BubblCstm {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named interview.Main. */

        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        int total = 0;
        for(int i=0; i<tc; i++) {
            int al = sc.nextInt();
            int ar[] = new int[al];
            for(int j=0; j<al;j++)
                ar[j] = sc.nextInt();

            for(int k=0; k<al-1; k++) {
                for(int l=0; l<al-1-i; l++) {
                    //System.out.println("ar[l]" +ar[l]+" ar[l+1] "+ar[l+1]);
                    if(ar[l] > ar[l+1]) {
                        //System.out.println("true");
                        int temp = ar[l+1];
                        ar[l+1] = ar[l];
                        ar[l] = temp;
                        total++;

                    }
                }
            }
            System.out.println(total);
            total = 0;
        }
    }
}