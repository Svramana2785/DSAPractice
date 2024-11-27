package com.local.xcode;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample {
    public static void main(String[] args) {
        // Create a CompletableFuture that runs asynchronously

        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(2000); // Simulate a long-running task
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return 42;
        });

        // Attach a callback that will run when the future is complete
        future.thenAccept(result -> {
            System.out.println("Result from CompletableFuture: " + result);
        });

        System.out.println("Doing other work while task is being executed...");

        // The main thread will not block while waiting for the result
    }
}
