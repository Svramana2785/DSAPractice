package com.local.xcode;

import java.util.*;
import java.util.stream.Collectors;

public class TopKEle {

    public static void main(String[] args) {
        topKFrequent(new int[]{1,2},2);
    }

        public static int[] topKFrequent(int[] nums, int k) {
            Map<Integer, Integer> hm = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                if (hm.containsKey(nums[i])) {
                    hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
                } else {
                    hm.put(nums[i], 1);
                }
            }

            List<Integer> ls =  hm.entrySet().stream().filter(x->x.getValue()>=k).map(Map.Entry::getKey).collect(Collectors.toList());

            System.out.println(ls);

            int[] arr =  hm.entrySet().stream().filter(x->x.getValue()>=k).mapToInt(Map.Entry::getKey).toArray();
            System.out.println(arr);

            hm.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).limit(k).mapToInt(Map.Entry::getKey).toArray();

            return arr;
        }
}
