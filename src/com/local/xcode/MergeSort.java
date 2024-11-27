package com.local.xcode;

public class MergeSort {

    public static void main(String[] args) {

        int arr[] = {4,7,2,1,8,4,2,-1,-3,-6,1,4,6,7,8,9};
        //int arr[] = {1,2,3,4,5};
        int len = arr.length;
        mergeSort(arr, 0, len-1);

        for(int i=0; i<len; i++) {
            System.out.print(arr[i]+" ");
        }

    }

    private static void mergeSort(int[] arr, int low, int high) {

        if(low == high)
            return;

        int mid = (low+high)/2;

        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        mergeArr(arr, low, high);

    }

    private static void mergeArr(int[] arr, int low, int high) {

        int mid = (low+high)/2;

        System.out.print("Low "+low+" High "+high+" mid "+ mid+" ");

        int p1 = low, p2 = mid+1;

        int tmp[] = new int[high-low+1];

        System.out.println("temp array "+tmp.length);
        int k =0;
        while (p1<=mid && p2<=high) {

            if(arr[p1] < arr[p2])
                tmp[k++] = arr[p1++];
            else
                tmp[k++] = arr[p2++];
        }

        while(p1<=mid){
            tmp[k++] = arr[p1++];
        }

        while(p2<=high) {
            tmp[k++] = arr[p2++];
        }

        for(int i=0; i<k; i++){
            arr[low+i] = tmp[i];
        }

        for (int i=low; i<=high; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}