package com.local.xcode;
public class SelectionSortMax {

    public static void main(String[] args) {
        int[] a = {176, -272, -272, -45, 269, -327, -945, 176};
        int n = a.length;

        // Selection Sort logic using the maximum value
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = 0; // Assume the maximum is at index 0
            for (int j = 1; j < n - i; j++) { // Only iterate through the unsorted part
                if (a[j] > a[maxIndex]) { // Find the actual maximum in the unsorted part
                    maxIndex = j;
                }
            }

            // Swap the found maximum with the last element of the unsorted part
            System.out.print(maxIndex+" ");
            int temp = a[maxIndex];
            a[maxIndex] = a[n - i - 1];
            a[n - i - 1] = temp;
        }
        System.out.println();
        // Print the sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
