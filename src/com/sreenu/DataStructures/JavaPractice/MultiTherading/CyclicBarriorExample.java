package com.sreenu.DataStructures.JavaPractice.MultiTherading;

import java.util.concurrent.CyclicBarrier;

/**
 * Created by SreenUNaik on 03-Mar-21.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class CyclicBarriorExample {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+"Has Started");
        CyclicBarrier barrier = new CyclicBarrier(4);
        PassengerThread passengerThread1 = new PassengerThread(1000,barrier,"Sreenu");
        PassengerThread passengerThread2 = new PassengerThread(2000,barrier,"abc");
        PassengerThread passengerThread3 = new PassengerThread(3000,barrier,"naik");
        PassengerThread passengerThread4 = new PassengerThread(4000,barrier,"mars");
        PassengerThread passengerThread5 = new PassengerThread(1000,barrier,"use");
        PassengerThread passengerThread6 = new PassengerThread(2000,barrier,"nu");
        PassengerThread passengerThread7 = new PassengerThread(3000,barrier,"Sree");
        PassengerThread passengerThread8 = new PassengerThread(4000,barrier,"Sri");
        passengerThread1.start();
        passengerThread2.start();
        passengerThread3.start();
        passengerThread4.start();
        passengerThread5.start();
        passengerThread6.start();
        passengerThread7.start();
        passengerThread8.start();
        System.out.println(Thread.currentThread().getName()+"Has End");
    }

    static class PassengerThread extends  Thread{
        private int duration;
        private CyclicBarrier cyclicBarrier;

        public PassengerThread(int duration, CyclicBarrier cyclicBarrier,String passengerName) {
            super(passengerName);
            this.duration = duration;
            this.cyclicBarrier = cyclicBarrier;
        }

        @Override
        public void run() {
            try {
                Thread.sleep(duration);
                System.out.println(Thread.currentThread().getName()+"Is arravied");
                int await = cyclicBarrier.await();
                if (await ==0){
                    System.out.println("Four passengers are arravied so cab is going to start");
                }

            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}

