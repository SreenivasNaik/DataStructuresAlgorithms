package com.sreenu.DataStructures.JavaPractice.MultiTherading;

import java.util.concurrent.Semaphore;

/**
 * Created by SreenUNaik on 12-Mar-21.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class PrintEvenOddNumbersInSequenceUsingSemaphore {
    public static void main(String[] args) {
        int totalNumber =10;
        int totalNumberOfThreads=2;
        OddEvenGeneratorUsingSemaphore oddEvenGeneratorUsingSemaphore = new OddEvenGeneratorUsingSemaphore();

      OddNumberGenerator oddNumberGenerator = new OddNumberGenerator(oddEvenGeneratorUsingSemaphore,20);
      EvenNumberGenerator evenNumberGenerator = new EvenNumberGenerator(oddEvenGeneratorUsingSemaphore,20);
      Thread thread1= new Thread(oddNumberGenerator,"Thead::1");
      Thread thread2= new Thread(evenNumberGenerator,"Thead::2");

        thread1.start();
        thread2.start();

    }
    static class OddEvenGeneratorUsingSemaphore{
        private Semaphore semaphoreEven = new Semaphore(0);
        private Semaphore semaphoreOdd = new Semaphore(1);
        public void printOddNumber(int number){
            try{
                semaphoreOdd.acquire();
                System.out.println(Thread.currentThread().getName()+":"+number);
            }catch (Exception e){
e.printStackTrace();
            }finally {
                semaphoreEven.release();
            }
        }
        public void printEvenNumber(int number){
            try{
                semaphoreEven.acquire();
                System.out.println(Thread.currentThread().getName()+":"+number);
            }catch (Exception e){
e.printStackTrace();
            }finally {
                semaphoreOdd.release();
            }
        }
    }
    static class OddNumberGenerator implements Runnable{
        private OddEvenGeneratorUsingSemaphore oddEvenGeneratorUsingSemaphore;
        private int totalNumberInSequence;

        public OddNumberGenerator(OddEvenGeneratorUsingSemaphore oddEvenGeneratorUsingSemaphore, int totalNumberInSequence) {
            this.oddEvenGeneratorUsingSemaphore = oddEvenGeneratorUsingSemaphore;
            this.totalNumberInSequence = totalNumberInSequence;
        }

        @Override
        public void run() {
            for (int i = 1; i <=totalNumberInSequence ; i=i+2) {
                oddEvenGeneratorUsingSemaphore.printOddNumber(i);

            }
        }
    }
    static class EvenNumberGenerator implements Runnable{
        private OddEvenGeneratorUsingSemaphore oddEvenGeneratorUsingSemaphore;
        private int totalNumberInSequence;

        public EvenNumberGenerator(OddEvenGeneratorUsingSemaphore oddEvenGeneratorUsingSemaphore, int totalNumberInSequence) {
            this.oddEvenGeneratorUsingSemaphore = oddEvenGeneratorUsingSemaphore;
            this.totalNumberInSequence = totalNumberInSequence;
        }

        @Override
        public void run() {
            for (int i = 2; i <=totalNumberInSequence ; i=i+2) {
                //System.out.println("II->i"+i);
                oddEvenGeneratorUsingSemaphore.printEvenNumber(i);
            }
        }
    }

}
