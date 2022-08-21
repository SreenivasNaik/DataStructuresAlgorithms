package com.sreenu.DataStructures.JavaPractice.MultiTherading;

/**
 * Created by SreenUNaik on 12-Mar-21.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class PrintNumbersInSequenceUsing3Threads {
    public static void main(String[] args) {
        int totalNumber =10;
        int totalNumberOfThreads=3;
        NumberGenerator numberGenerator = new NumberGenerator(totalNumberOfThreads,totalNumber);
        Thread thread1 = new Thread(new SequenceGenerator(numberGenerator,1),"Thread-1");
        Thread thread2 = new Thread(new SequenceGenerator(numberGenerator,2),"Thread-2");
        Thread thread3 = new Thread(new SequenceGenerator(numberGenerator,0),"Thread-3");
        thread1.start();
        thread2.start();
        thread3.start();
    }
    static class NumberGenerator{
        private int number =1;
        private int numberOfThreads;
        private int totalNumbersInSequence;

        public NumberGenerator(int numberOfThreads, int totalNumbersInSequence) {
            this.numberOfThreads = numberOfThreads;
            this.totalNumbersInSequence = totalNumbersInSequence;
        }
        public void printNumbers(int results){
            synchronized (this){
                while (number<totalNumbersInSequence-1){
                    while (number%numberOfThreads!=results){
                        try {
                            wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(Thread.currentThread().getName()+"::"+number++);
                    notifyAll();
                }
            }
        }
    }

    static class SequenceGenerator implements Runnable{
        private NumberGenerator numberGenerator;
        private int result;

        public SequenceGenerator(NumberGenerator numberGenerator, int result) {
            this.numberGenerator = numberGenerator;
            this.result = result;
        }

        @Override
        public void run() {
            numberGenerator.printNumbers(result);
        }
    }

}
