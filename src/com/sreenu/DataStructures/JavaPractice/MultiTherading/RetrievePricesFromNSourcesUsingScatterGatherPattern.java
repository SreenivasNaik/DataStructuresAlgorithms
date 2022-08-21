package com.sreenu.DataStructures.JavaPractice.MultiTherading;

import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by SreenUNaik on 30-Mar-21.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class RetrievePricesFromNSourcesUsingScatterGatherPattern {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        Set<Integer> set = Collections.synchronizedSet(new HashSet<>());
        CountDownLatch countDownLatch = new CountDownLatch(3);
        executorService.submit(new Task(set,countDownLatch));
        executorService.submit(new Task(set,countDownLatch));
        executorService.submit(new Task(set,countDownLatch));
        countDownLatch.await(3, TimeUnit.SECONDS);
        System.out.println("Set::"+set);
    }
    static class Task implements Runnable{
        private Set<Integer> price;
        CountDownLatch countDownLatch;
        Random random = new Random();

        public Task(Set<Integer> price, CountDownLatch countDownLatch) {
            this.price = price;
            this.countDownLatch = countDownLatch;
        }

        @Override
        public void run() {
            price.add(random.nextInt());
            countDownLatch.countDown();
            System.out.println("CountDownCount"+countDownLatch.getCount());
        }
    }
}
