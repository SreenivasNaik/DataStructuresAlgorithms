package com.sreenu.DataStructures.JavaPractice.MultiTherading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by SreenUNaik on 12-Mar-21.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class PrintEvenOddNumbersInSequenceUsingExecutorFramework {
    public static void main(String[] args) {
        int totalNumber =10;
        int totalNumberOfThreads=2;
        NumberGenerator numberGenerator = new NumberGenerator(totalNumberOfThreads,totalNumber);
        ExecutorService executorService = Executors.newFixedThreadPool(totalNumberOfThreads);
        executorService.submit(new SequenceGenerator(numberGenerator,1));
        executorService.submit(new SequenceGenerator(numberGenerator,0));
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
                while (number<=totalNumbersInSequence-1){
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
