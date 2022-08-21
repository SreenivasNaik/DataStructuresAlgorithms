package com.sreenu.DataStructures.JavaPractice.MultiTherading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.stream.IntStream;

/**
 * Created by SreenUNaik on 30-Mar-21.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class SemaphoresExample {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(3);
        ExecutorService executorService = Executors.newFixedThreadPool(50);
        IntStream.range(1, 5).forEach(i -> {
            System.out.println(Thread.currentThread().getName() + "::Call::" + i);
            executorService.execute(new Task(semaphore, i));

        });
        executorService.shutdown();
    }

    static class Task implements Runnable {
        Semaphore semaphore;
        int i;

        public Task(Semaphore semaphore, int i) {
            this.semaphore = semaphore;
            this.i = i;
        }

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + ":Entered");
            try {
                semaphore.acquire();
                System.out.println(Thread.currentThread().getName() + "CurrentNumber::" + i + "Locked");
                System.out.println(Thread.currentThread().getName() + ": No of avaiable locks::" + semaphore.availablePermits());
                semaphore.release();
                System.out.println(Thread.currentThread().getName() + "CurrentNumber::" + i + "Released");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
