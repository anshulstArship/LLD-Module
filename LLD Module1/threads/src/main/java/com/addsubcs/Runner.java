package com.addsubcs;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Runner {
    public static void main(String[] args) throws InterruptedException {
        Count count = new Count(0);
        Lock lock = new ReentrantLock();
        Adder adder = new Adder(count);
        Subtractor sub = new Subtractor(count);

        ExecutorService executor = Executors.newCachedThreadPool();
        executor.execute(adder);
        executor.execute(sub);
        executor.awaitTermination(1, TimeUnit.SECONDS); // In order to ensure both the threads are executed
        System.out.println("Value = " +count.getVal());
    }
}
