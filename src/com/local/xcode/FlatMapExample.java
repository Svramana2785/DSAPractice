package com.local.xcode;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FlatMapExample {

    public static void main(String[] args) {
        List<List<String>> ls = new ArrayList<>();
        List<String> ls1 = Arrays.asList("1","2","3","4");
        List<String> ls2 = Arrays.asList("1","2","3","4");
        List<String> ls3 = Arrays.asList("1","2","3","4");

        ls.add(ls1);ls.add(ls2);ls.add(ls3);

        Predicate<String> custom = (s) -> "1".equalsIgnoreCase(s) || "2".equalsIgnoreCase(s);
        Predicate<String> custom2 = (s) -> {
            if("1".equalsIgnoreCase(s))
                return true;
            else if ("3".equalsIgnoreCase(s))
                return true;
            else
                return false;
        };

        List<String> newList =  ls.stream().flatMap(Collection::stream).collect(Collectors.toList());

        List<String> oneList = newList.stream().map(str -> {
            if("1".equalsIgnoreCase(str))
                return str;
            else
                return str;
        }).toList();

        List<String> predict =  newList.stream().filter(custom2).toList();

        System.out.println(newList);
        System.out.println(oneList);
        System.out.println(predict);

    }

}
