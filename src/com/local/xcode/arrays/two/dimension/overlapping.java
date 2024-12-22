package com.local.xcode.arrays.two.dimension;

public class overlapping {

    public static void main(String[] args) {

//        int[][] a = {{1,3},{2,6},{8,10},{15,18}};
//        int[][] a = {{2,10},{4,9},{6,7}};
        int[][] a = {{1,5},{4,6},{7,20},{15,30},{31,34},{35,50}};

        int n = a.length;
        int i=1;

        int[][] res = new int[n][n];
        int idx = 0;
        int st1 = a[0][0];
        int en1 = a[0][1];

        while (i<n) {
            int j = 0;

            int st2 = a[i][j++];
            int en2 = a[i++][j];

            if (en1 >= st2) {
                st1 = Math.min(st1,st2);
                en1 = Math.max(en1, en2);
            }  else {
                res[idx][0] = st1;
                res[idx][1] = en1;
                //System.out.println(st1+" "+en1);
                st1 = st2;
                en1 = en2;
                idx++;
            }

        }
        res[idx][0] = st1;
        res[idx][1] = en1;
        idx++;
        int[][] fn = new int[idx][2];
        for (int k=0; k<idx;k++) {
            fn[k][0] = res[k][0];
            fn[k][1] = res[k][1];
        }

        for(int l=0; l<fn.length;l++) {
            System.out.println(fn[l][0]+" "+fn[l][1]);
        }
    }

}
