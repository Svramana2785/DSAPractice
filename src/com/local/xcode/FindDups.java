package com.local.xcode;

import java.util.HashSet;
import java.util.Set;

public class FindDups {

    public static void main(String[] args) {

        int []a = {1,2,3,4,5,6,7,8,9,9};

        Set<Integer> st = new HashSet<>();

        for (int aa:a) {
            if(st.contains(aa))
                System.out.println("found");
            else
                st.add(aa);
        }


    }

}
