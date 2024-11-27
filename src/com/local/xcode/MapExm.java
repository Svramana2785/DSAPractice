package com.local.xcode;

import java.util.HashMap;
import java.util.Map;

public class MapExm {

    public static void main(String[] args) {

        Map mp = new HashMap<>();

        mp.put("abc", 1);
        mp.computeIfAbsent("abc" , k -> getAsciVal(k) );
        mp.computeIfAbsent("bcd" , k -> getAsciVal(k) );

        System.out.println(mp.get("abc"));

    }

    public static int getAsciVal(Object s) {
        return String.valueOf(s).length();
    }

}
