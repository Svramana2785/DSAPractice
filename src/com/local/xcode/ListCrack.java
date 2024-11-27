package com.local.xcode;

import java.util.Arrays;
import java.util.List;

public class ListCrack {

    public static void main(String[] args) {

        List ints = Arrays.asList(1,2,3);
        List int2 = ints;
        int2.add(3.14);

        System.out.println(int2);

    }

}
