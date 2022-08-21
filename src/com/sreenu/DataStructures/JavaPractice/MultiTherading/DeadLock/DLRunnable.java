package com.sreenu.DataStructures.JavaPractice.MultiTherading.DeadLock;

import java.util.concurrent.locks.Lock;

/**
 * Created by SreenUNaik on 01-Mar-21.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class DLRunnable implements Runnable {
    private Lock lock1 =null;
    private Lock lock2 =null;

    public DLRunnable(Lock lock1, Lock lock2) {
        this.lock1 = lock1;
        this.lock2 = lock2;
    }

    @Override
    public void run() {
    String threadName = Thread.currentThread().getName();
        System.out.println(threadName+": Attempting to Lock lock2");
        lock2.lock();
        System.out.println(threadName+":  Locked lock2");
        try {
            Thread.sleep(3000);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(threadName+": Attempting to Lock lock1");
        lock1.lock();
        System.out.println(threadName+":  Locked lock1");
        System.out.println(threadName+":  UnLocking lock2");
        lock2.unlock();
        System.out.println(threadName+":  UnLocked lock1");
        lock1.unlock();
    }
}
