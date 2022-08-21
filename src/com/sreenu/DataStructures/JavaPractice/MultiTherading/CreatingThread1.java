package com.sreenu.DataStructures.JavaPractice.MultiTherading;

/**
 * Created by SreenUNaik on 01-Mar-21.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class CreatingThread1 extends Thread {
    public  void run(){
        System.out.println("Thread is Running");
        System.out.println("Thread is Stoped");
    }

    public static void main(String[] args) {
        CreatingThread1 thread1 = new CreatingThread1();

        MyRunnable runnable = new MyRunnable();
        Thread thread2 = new Thread(runnable,"Runnale Thread 1");
        Thread thread3 = new Thread(runnable,"Runnale Thread 2");

        thread1.start();
        thread2.start();
        thread3.start();

    }

    public static class MyRunnable implements Runnable{
        private int count =0;

        @Override
        public void run() {
            System.out.println("Runnable Thread started");
            for (int i = 0; i < 100; i++) {
                synchronized (this) {
                    this.count++;
                }
            }
            System.out.println(Thread.currentThread().getName()+":Count:"+this.count);
            System.out.println("Runnable Thread Ended");
        }
    }
}
