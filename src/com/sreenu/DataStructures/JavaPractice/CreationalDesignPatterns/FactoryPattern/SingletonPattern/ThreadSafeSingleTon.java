package com.sreenu.DataStructures.JavaPractice.CreationalDesignPatterns.FactoryPattern.SingletonPattern;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by SreenUNaik on 15-Mar-21.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class ThreadSafeSingleTon {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(6);
        MyThread myThread = new MyThread();
        executorService.execute(myThread);
        executorService.execute(myThread);
        executorService.execute(myThread);
        executorService.execute(myThread);
        executorService.execute(myThread);
        executorService.execute(myThread);
        executorService.shutdown();
    }
    static class MyThread implements Runnable{

        @Override
        public void run() {
            SingleTonThreadSafe singleTonClonable = SingleTonThreadSafe.getSingleTonClonable();
            System.out.println(Thread.currentThread().getName()+":"+singleTonClonable.hashCode());
        }
    }
    static class SingleTonThreadSafe {

        private static SingleTonThreadSafe singleTonClonable = null;

        private SingleTonThreadSafe() {
        }

        public static  SingleTonThreadSafe getSingleTonClonable() {
            if (singleTonClonable == null) {
                synchronized (SingleTonThreadSafe.class) {
                    if (singleTonClonable == null) {
                        singleTonClonable = new SingleTonThreadSafe();
                    }
                }
            }
            return singleTonClonable;
        }
    }

    }
