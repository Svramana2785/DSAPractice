package com.local.xcode;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SubArry {
    public static void main(String[] args) {
        int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23};
        int sum = 23, maxSum =0, currSum =0;
        int start =0, end = 0, distance = 0;
        for( int i=0; i<arr.length; i++) {
//            System.out.println("Something critical " + arr[i]);
            currSum = 0;
            for( int j=i; j<arr.length; j++) {
//                System.out.println("Something sick " + arr[j]);
                currSum = currSum+arr[j];
//                System.out.println("Curr  sum " + currSum +" i -> " +i +"j -> "+j);
                int curDist = j-i;
//                System.out.println(" Current dist " + curDist);
                if (currSum == sum && distance < curDist) {
                    for(int k = i; k<=j ; k++){
                        System.out.print(" vals " + arr[k]);
                    }
                    start = i;
                    end = j;
                    distance = j-i;
                    System.out.println(" curr i::" + i + " J:: " +j + " sum " + currSum);
                }
            }
        }
        System.out.println("Max possible sum " + maxSum + " with Indexes " +start + " " + end + " values are ");

        //Arrays.stream(arr).filter()

    }
}