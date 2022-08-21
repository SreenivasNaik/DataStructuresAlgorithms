package com.sreenu.DataStructures.JavaPractice.MultiTherading;

/**
 * Created by SreenUNaik on 12-Mar-21.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class PrintEvenOddByTwoThreads {
    int counter =1;
    static int N;
    public void printEvenNumber(){
        synchronized (this){
            while (counter<N){
                while (counter%2==0){
                    try{
                        System.out.println("Thrad::"+Thread.currentThread().getName()+"calling Wait");
                        wait();

                    }catch (Exception e){}
                }
                System.out.println("Count::"+counter);
                counter++;
                notify();
                System.out.println("Thrad::"+Thread.currentThread().getName()+"calling Notifed");
            }
        }
    }
    public void printOddNumber(){
        synchronized (this){
            while (counter<N){
                while (counter%2!=0){
                    try{
                        System.out.println("Thrad::"+Thread.currentThread().getName()+"calling wait");
                        wait();
                    }catch (Exception e){}
                }
                System.out.println("Count::"+counter);
                counter++;
                notify();
                System.out.println("Thrad::"+Thread.currentThread().getName()+"calling Notifed");
            }
        }
    }

    public static void main(String[] args) {
        N =10;
        PrintEvenOddByTwoThreads printEvenOddByTwoThreads = new PrintEvenOddByTwoThreads();
        Thread thread1 = new Thread(()->{
            printEvenOddByTwoThreads.printEvenNumber();
        });
        Thread thread2 = new Thread(()->{
            printEvenOddByTwoThreads.printOddNumber();
        });
        thread1.setName("Even");
        thread2.setName("Odd");
        thread1.start();
        thread2.start();
    }
}
