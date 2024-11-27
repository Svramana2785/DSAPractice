package com.local.xcode;

public class DeadlockExample {

    // Two resources
    private final Object lock1 = new Object();
    private final Object lock2 = new Object();

    public static void main(String[] args) {
        DeadlockExample deadlock = new DeadlockExample();

        // Thread 1: Attempts to lock lock1 first and then lock2
        Thread thread1 = new Thread(() -> {
            deadlock.method1();
        });

        // Thread 2: Attempts to lock lock2 first and then lock1
        Thread thread2 = new Thread(() -> {
            deadlock.method2();
        });

        // Start both threads
        thread1.start();
        thread2.start();
    }

    // Method 1 tries to lock lock1 first and then lock2
    public void method1() {
        synchronized (lock1) {
            System.out.println("Thread 1: Holding lock1...");

            try { Thread.sleep(100); } // Simulate some work
            catch (InterruptedException e) {}

            System.out.println("Thread 1: Waiting for lock2...");

            synchronized (lock2) {
                System.out.println("Thread 1: Holding lock1 & lock2...");
            }
        }
    }

    // Method 2 tries to lock lock2 first and then lock1
    public void method2() {
        synchronized (lock2) {
            System.out.println("Thread 2: Holding lock2...");

            try { Thread.sleep(100); } // Simulate some work
            catch (InterruptedException e) {}

            System.out.println("Thread 2: Waiting for lock1...");

            synchronized (lock1) {
                System.out.println("Thread 2: Holding lock1 & lock2...");
            }
        }
    }
}
