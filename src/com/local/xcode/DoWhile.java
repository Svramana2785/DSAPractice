package com.local.xcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.atomic.AtomicBoolean;

public class DoWhile {

    private volatile ArrySort a = new ArrySort();
    public static void main(String[] args) throws IOException {
        char c ;
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        do{
        c = (char) obj.read();
            System.out.println(c);
        } while (c !='q');
    }
}