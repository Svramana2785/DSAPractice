package com.local.xcode;

import java.io.Serializable;
import java.util.Date;

public class Emp implements Serializable {

    public static void main(String[] args) {

        Date d = new Date();

        System.out.println(d);

        d.setMonth(2);

        System.out.println(d);


    }


}
