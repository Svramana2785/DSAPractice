package com.local.xcode;

import java.util.concurrent.*;

public class FutureExample {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // Create a thread pool with 5 threads
        ExecutorService executor = Executors.newFixedThreadPool(5);

        // Submit a task to the thread pool and get a Future object
        Future<Integer> futureResult = executor.submit(() -> {
            // Simulate a long-running task
            Thread.sleep(2000);
            return 42;
        });

        // Do some other work in the main thread
        System.out.println("Doing other work while task is being executed...");

        System.out.println("Future statsus is --> "+ futureResult.isDone());

        // Now, retrieve the result of the future (blocks until the task is complete)
        Integer result = futureResult.get();
        System.out.println("Result from the Future: " + result);

        // Shutdown the executor
        executor.shutdown();
    }
}
