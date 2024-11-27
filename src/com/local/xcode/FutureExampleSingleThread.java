package com.local.xcode;

import java.util.concurrent.*;

public class FutureExampleSingleThread {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // Create a thread pool with a single thread
        ExecutorService executor = Executors.newSingleThreadExecutor();
        FutureExampleSingleThread sf = new FutureExampleSingleThread();
        Future<String> fut =  executor.submit(()->{
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "123";
        });

        CompletableFuture<Integer> cf =  CompletableFuture.supplyAsync(()->{return 100;});

        System.out.println("Completable future --->" +cf.thenApply(v-> {
            System.out.println("The result we got " + v);
            return v;
        }));

        System.out.println("The future result --> " +fut.get());

        // Submit a callable task to the executor
        Callable<String> task = () -> {
            try {
                // Simulate a long-running task (e.g., 2 seconds delay)
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Result from asynchronous task";
        };

        // Submit the task and get a Future object
        Future<String> future = executor.submit(task);

        // Do some other tasks while the future is being computed
        System.out.println("Doing some other work...");

        // Check if the task is completed (non-blocking)
        if (!future.isDone()) {
            System.out.println("Task is still not done...");
        }

        // Retrieve the result of the task (this call will block until the task is done)
        try {
            String result = future.get(); // Blocks until the result is available
            System.out.println("Task completed with result: " + result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        // Shutdown the executor
        executor.shutdown();
    }

    public int getData(){return 1;}
}