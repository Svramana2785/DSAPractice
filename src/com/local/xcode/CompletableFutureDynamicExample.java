package com.local.xcode;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CompletableFutureDynamicExample {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        // Create 10 CompletableFutures dynamically
        List<CompletableFuture<String>> futuresList = IntStream.range(1, 11)
                .mapToObj(i -> CompletableFuture.supplyAsync(() -> performTask(i)))
                .collect(Collectors.toList());

        // Combine all futures using CompletableFuture.allOf()
        CompletableFuture<Void> allFutures = CompletableFuture.allOf(futuresList.toArray(new CompletableFuture[0]));

        // Once all futures are done, gather the results
        CompletableFuture<List<String>> allResults = allFutures.thenApply(v ->
                futuresList.stream()
                        .map(CompletableFuture::join) // `join()` to get the result from each CompletableFuture
                        .collect(Collectors.toList())
        );

        // Get the final combined result
        List<String> results = allResults.get(); // Block and get the result (for demonstration purposes)
        results.forEach(System.out::println); // Print all results
    }

    // Simulating some task
    public static String performTask(int taskId) {
        try {
            Thread.sleep(1000); // Simulate some delay
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return "Task " + taskId + " result";
    }
}