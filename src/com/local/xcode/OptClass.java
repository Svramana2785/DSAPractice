package com.local.xcode;

import java.util.Optional;

public class OptClass {

    public static void main(String[] args) {

        Optional first = Optional.of("String");

        String [] a = new String[10];
        a[9] = null;
        Optional sec = Optional.ofNullable(a[9]);

        System.out.println(first.isPresent());
        System.out.println(sec.isPresent());


    }


}
