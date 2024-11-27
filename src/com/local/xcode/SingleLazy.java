package com.local.xcode;

import java.util.concurrent.CompletableFuture;

public class SingleLazy {
    private static volatile SingleLazy obj = null;
    private SingleLazy() {
    }
    public static SingleLazy getInstance() {

        if (obj == null) {
            synchronized (SingleLazy.class) {
                if (obj == null) {
                    System.out.println("Object Created Lazy ....");
                    obj = new SingleLazy();
                }
            }
        }
        return obj;
    }
}