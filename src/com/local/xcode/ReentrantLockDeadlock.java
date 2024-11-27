package com.local.xcode;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDeadlock {

    private final Lock lock1 = new ReentrantLock();
    private final Lock lock2 = new ReentrantLock();

    public static void main(String[] args) {
        ReentrantLockDeadlock deadlock = new ReentrantLockDeadlock();

        Thread thread1 = new Thread(() -> {
            deadlock.method1();
        });

        Thread thread2 = new Thread(() -> {
            deadlock.method2();
        });

        thread1.start();
        thread2.start();
    }

    public void method1() {
        lock1.lock();
        System.out.println("Thread 1: Holding lock1, waiting for lock2...");

        try {
            Thread.sleep(100);  // Simulate some work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        lock2.lock();  // This will cause a deadlock
        System.out.println("Thread 1: Acquired lock2");

        lock2.unlock();
        lock1.unlock();
    }

    public void method2() {
        lock2.lock();
        System.out.println("Thread 2: Holding lock2, waiting for lock1...");

        try {
            Thread.sleep(100);  // Simulate some work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        lock1.lock();  // This will cause a deadlock
        System.out.println("Thread 2: Acquired lock1");

        lock1.unlock();
        lock2.unlock();
    }
}
