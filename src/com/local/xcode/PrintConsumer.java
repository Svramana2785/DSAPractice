package com.local.xcode;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class PrintConsumer {

    public static void main(String[] args) {

        Consumer<String> onlyPrint  = s -> System.out.println(s);

        Supplier<String> supp = () -> "Hello world";

        onlyPrint.accept("12345");

        System.out.println(supp.get());

        List<String> ls = Arrays.asList("1","2","3","4","5");

        Consumer<String> printer = s-> System.out.println(s);

        ls.forEach(printer);

    }

}
