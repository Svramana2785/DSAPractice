package com.local.xcode;

public class ArraysItr {

    public static void main(String[] args) {

        int [] a = new int[]{100,50,50,50};
        int cnt = 0;
        int res = 0;
        int req = 200;
        int len = 3;
        System.out.println("Array Len --> "+a.length);
        for (int i=0; i<a.length;i++) {
            cnt=0;
            System.out.println("I val " +i+ " len "+ (i+len) +  " len" + a.length);
            if(i+len-1 < a.length) {
                for(int k=i; k<(i+len); k++) {
                    cnt +=a[k];
                }
                if(cnt == req){
                    System.out.println("got it");
                }
                //System.out.println("works");
            }

        }

    }

}
