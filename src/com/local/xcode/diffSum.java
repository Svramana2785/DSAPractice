package com.local.xcode;

public class diffSum {

    public static void main(String[] args) {

            //long ar[] = {-30,-10,10,15,10,10};
            int k = -10;
        long ar[] =  {30,1,3,4,40};
                int n = ar.length;
             mergeSorter(ar, 0, n-1);

            boolean def = false;
            int p1 = 0, p2 = 1;
            long absK = Math.abs(k);
            while(p2<n) {
                if((ar[p2]-ar[p1]) > absK)
                    p1++;
                else if((ar[p2]-ar[p1]) < absK)
                    p2++;
                else if((ar[p2]-ar[p1]) == absK && p1 != p2) {
                    def = true;
                    break;
                }

                if(p1==p2)
                    p2++;
            }

            System.out.println(def? "true":"false");


    }

    public static void mergeSorter(long[] ar, int low, int high) {

        if(low == high)
            return;

        int mid = (low+high)/2;

        mergeSorter(ar, low, mid);
        mergeSorter(ar, mid+1, high);
        mergeArray(ar, low, high);

    }

    public static void mergeArray(long[] ar, int low, int high) {

        int mid = (low+high)/2;
        int k=0;
        long temp[] = new long[high-low+1];
        int p1 = low; int p2 = mid+1;

        while(p1<=mid && p2<=high) {
            if(ar[p1] < ar[p2])
                temp[k++] = ar[p1++];
            else
                temp[k++] = ar[p2++];
        }

        while(p1<=mid){
            temp[k++] = ar[p1++];
        }

        while(p2<=high){
            temp[k++] = ar[p2++];
        }

        for(int i=0; i<k; i++){
            ar[low+i] = temp[i];
        }

    }
}
