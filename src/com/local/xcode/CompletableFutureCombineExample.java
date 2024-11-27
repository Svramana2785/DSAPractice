package com.local.xcode;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureCombineExample {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // First CompletableFuture
        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Task 1 result";
        });

        // Second CompletableFuture
        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Task 2 result";
        });

        future1.thenApply(v->{
            System.out.println("output is  "+v);
            return v;
        });

        // Combine results of both futures
        CompletableFuture<String> combinedFuture = future1.thenCombine(future2, (result1, result2) -> {
            return result1 + " and " + result2;
        });

        // Get the combined result
        System.out.println("Combined result: " + combinedFuture.get());
    }
}