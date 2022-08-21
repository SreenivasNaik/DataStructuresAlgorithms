package com.sreenu.DataStructures.JavaPractice;

/**
 * Created by SreenUNaik on 12-Feb-21.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class MultiTherding {
    public static void main(String[] args) {
        ABC abc = new ABC();
        abc.start();
        Interface inter = new Interface();
        Thread thread = new Thread(inter);
        thread.start();
    }
    static class ABC extends Thread{
        public void run(){
            for (int i = 0; i <5 ; i++) {
                System.out.println("I-->"+i+"Id:"+Thread.currentThread().getId());
            }
        }
    }
    static class Interface implements Runnable{

        @Override
        public void run() {
            for (int i = 0; i <5 ; i++) {
                System.out.println("I-->"+i);
            }
        }
    }
}


