package com.local.xcode;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class ContainDups {

    public static void main(String[] args) {

        int a[] = {1,2,3,1};
        int k = 3;
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if (mp.get(a[i]) != null) {
                int j = mp.get(a[i]);
                if (Math.abs(i - j) <= k) {
                    //return true;
                }
            }
            mp.put(a[i], i);
        }
    }
}
