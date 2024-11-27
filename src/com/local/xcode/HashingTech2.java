package com.local.xcode;

public class HashingTech2 {

    int val;

    //int goto;
    int unsigned;

    public static void main(String[] args) {

        System.out.println(new HashingTech2().hashCode());
        System.out.println(new HashingTech2().hashCode());

    }

    public int hashcode () {
        System.out.println("hello");
        return (int)(val^5);
    }
}
