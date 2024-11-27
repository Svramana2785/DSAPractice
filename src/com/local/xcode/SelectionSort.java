package com.local.xcode;
public class SelectionSort {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named interview.Main. */

            int a[] = {176, -272, -272, -45, 269, -327, -945, 176};
            int n = a.length;


            /*for(int i=0; i<n; i++)
                System.out.print(a[i]+" ");*/

            for(int i=0; i<n-1; i++) {
                int max = i;
                for(int j=0; j<n-1; j++) {
                    if(a[j] > a[max]) {
                        max = j;
                    }
                }
                System.out.print(max);
                int temp = a[max];
                a[max] = a[n-i-1];
                a[n-i-1] = temp;
            }
            System.out.println();

            for(int i=0; i<n; i++)
                System.out.print(a[i]+" ");
        }

}
