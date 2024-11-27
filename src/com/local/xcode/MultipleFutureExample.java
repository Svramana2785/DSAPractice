package com.local.xcode;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleFutureExample {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        List<Callable<String>> tasks = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            int taskId = i;
            tasks.add(() -> {
                Thread.sleep(1000 * taskId); // Simulate varying task duration
                return "Result from Task " + taskId;
            });
        }

        // Submit all tasks and collect their Future objects
        List<Future<String>> futures = executor.invokeAll(tasks);

        // Get the results of all tasks
        for (Future<String> future : futures) {
            System.out.println(future.get()); // Blocking call to get the result
        }

        // Shutdown the executor
        executor.shutdown();
    }
}
