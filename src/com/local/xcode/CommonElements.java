package com.local.xcode;
public class CommonElements {

    // Function to find and print common elements between two arrays
    public static void findCommonElements(int[] array1, int[] array2) {
        System.out.println("Common elements are: ");

        // Loop through the first array
        for (int i = 0; i < array1.length; i++) {
            // For each element in array1, check against all elements in array2
            for (int j = 0; j < array2.length; j++) {
                // If a common element is found, print it
                if (array1[i] == array2[j]) {
                    System.out.print(array1[i] + " ");
                    // Break to avoid printing duplicates if the element appears multiple times in array2
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array1 = {1, 3, 4, 5, 7};
        int[] array2 = {2, 3, 5, 6, 7};

        // Call the function to find common elements
        findCommonElements(array1, array2);
    }
}