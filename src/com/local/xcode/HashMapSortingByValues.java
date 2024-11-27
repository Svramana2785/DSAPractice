package com.local.xcode;

import javax.swing.text.html.parser.Entity;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HashMapSortingByValues {

    public static void main(String[] args) {

        Map<String, String> stateCapitalMap = new HashMap<>();
        stateCapitalMap.put("California", "Sacramento");
        stateCapitalMap.put("Texas", "Austin");
        stateCapitalMap.put("New York", "Albany");
        stateCapitalMap.put("Florida", "Tallahassee");
        stateCapitalMap.put("Washington", "Olympia");
        stateCapitalMap.put("India", "Delhi");

        System.out.println(stateCapitalMap.values());
        System.out.println(stateCapitalMap);
        System.out.println(stateCapitalMap.entrySet());

        stateCapitalMap.keySet();

        List<Map.Entry<String , String>> ls = new ArrayList<>(stateCapitalMap.entrySet());
        Collections.sort(ls, new Comparator<Map.Entry<String, String>>() {
            @Override
            public int compare(Map.Entry<String, String> o1, Map.Entry<String, String> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        System.out.println(ls);

        Collections.sort(ls, new Comparator<Map.Entry<String, String>>() {
            @Override
            public int compare(Map.Entry<String, String> o1, Map.Entry<String, String> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });

        Collections.sort(ls, (Map.Entry<String,String> o1, Map.Entry<String,String> o2) -> {
            return o1.getValue().compareTo(o2.getValue());
        });

        System.out.println("Sorted List --> "+ls);

       Map<Map.Entry<String,String>,Map.Entry<String,String>> mp =  null;//stateCapitalMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println("Hello --> " + mp);

        /*Map<String, String> sortedMap = stateCapitalMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,       // Key mapper
                        Map.Entry::getValue,     // Value mapper
                        (o,p) -> o,
                        LinkedHashMap::new       // Supplier for the new map, LinkedHashMap to maintain order
                ));

        Map<String, String> sortedMap = stateCapitalMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,       // Key mapper
                        Map.Entry::getValue,     // Value mapper
                        LinkedHashMap::new       // Supplier for the new map, LinkedHashMap to maintain order
                ));*/

         List<Object> ms =   stateCapitalMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toList());


        System.out.println(stateCapitalMap.entrySet().stream().collect(Collectors.toMap(Function.identity(),Function.identity())));


        System.out.println("Objects -->" + ms);
    }

}