package com.sreenu.DataStructures.JavaPractice.MultiTherading;

/**
 * Created by SreenUNaik on 01-Mar-21.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class RaceConditionExample {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread thread1 = new Thread(getRunnable(counter,"Thread 1 Final count"));
        Thread thread2 = new Thread(getRunnable(counter,"Thread 2 Final count"));
        thread1.start();
        thread2.start();
    }

    private static Runnable getRunnable(Counter counter, String s) {
        return ()->{
            for (int i = 0; i <100000 ; i++) {
                counter.incAndGet();
            }
            System.out.println(s+counter.get());
        };
    }
}
class Counter{
    private long count =0;

    public long get() {
        return this.count;
    }

    public long incAndGet() {
        synchronized (this){
        this.count++;
        return this.count;}
    }
}
