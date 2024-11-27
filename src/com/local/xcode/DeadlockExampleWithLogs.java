package com.local.xcode;

public class DeadlockExampleWithLogs {

    // Two shared resources (locks)
    private final Object lock1 = new Object();
    private final Object lock2 = new Object();

    public static void main(String[] args) {
        DeadlockExampleWithLogs deadlock = new DeadlockExampleWithLogs();

        // Thread 1: Tries to lock lock1 first and then lock2
        Thread thread1 = new Thread(() -> {
            deadlock.method1();
        });

        // Thread 2: Tries to lock lock2 first and then lock1
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

            try {
                Thread.sleep(100); // Simulate some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Thread 1: Waiting for lock2...");

            synchronized (lock2) {
                System.out.println("Thread 1: Acquired lock2, now holding lock1 & lock2");
            }
        }
        System.out.println("Thread 1: Released lock1 & lock2, finished execution.");
    }

    // Method 2 tries to lock lock2 first and then lock1
    public void method2() {
        synchronized (lock2) {
            System.out.println("Thread 2: Holding lock2...");

            try {
                Thread.sleep(100); // Simulate some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Thread 2: Waiting for lock1...");

            synchronized (lock1) {
                System.out.println("Thread 2: Acquired lock1, now holding lock2 & lock1");
            }
        }
        System.out.println("Thread 2: Released lock1 & lock2, finished execution.");
    }
}
