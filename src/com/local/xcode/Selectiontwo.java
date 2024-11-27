package com.local.xcode;

public class Selectiontwo {

    public static void main(String[] args) {
        int[] a = {176, -272, -272, -45, 269, -327, -945, 176};
        int n = a.length;

        // Selection Sort logic
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i; // Assume the minimum is at index i
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[minIndex]) { // Find the actual minimum in the unsorted part
                    minIndex = j;
                }
            }

            // Swap the found minimum with the first element of the unsorted part
            System.out.print(minIndex+" ");
            int temp = a[minIndex];
            a[minIndex] = a[i];
            a[i] = temp;
        }
        System.out.println();
        // Print the sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
