package com.sreenu.DataStructures.JavaPractice.MultiTherading;

/**
 * Created by SreenUNaik on 01-Mar-21.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class ThreadLocalExample {
    public static void main(String[] args) {
        ThreadLocal<String> threadLocal = new ThreadLocal<>();
        Thread thread1 = new Thread(()->{
           threadLocal.set("Thread 1");
           try {
               Thread.sleep(2000);
           }catch (InterruptedException e){
               e.printStackTrace();
           }
            System.out.println(threadLocal.get());
           threadLocal.remove();
            System.out.println(threadLocal.get());
        });
        Thread thread2 = new Thread(()->{
            threadLocal.set("Thread 2");
            try {
                Thread.sleep(2000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(threadLocal.get());
        });
        thread1.start();
        thread2.start();
    }
}
