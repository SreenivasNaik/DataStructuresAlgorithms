package com.sreenu.DataStructures.JavaPractice.MultiTherading;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by SreenUNaik on 30-Mar-21.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class ConsumerProducerProblemUsingLocksConditions {
    public static void main(String[] args) {
        MyBlockingQueue myBlockingQueue = new MyBlockingQueue(10);
        Producer producer = new Producer(myBlockingQueue);
        Consumer consumer = new Consumer(myBlockingQueue);
        producer.start();
        consumer.start();

    }
    static class Producer extends Thread{
        MyBlockingQueue myBlockingQueue;

        public Producer( MyBlockingQueue myBlockingQueue) {
            super("Producer");
            this.myBlockingQueue = myBlockingQueue;
        }
        @Override
        public void run() {
            for (int i = 0; i < 10 ; i++) {
                myBlockingQueue.put();
            }

        }
    }
    static class Consumer extends Thread{
        MyBlockingQueue myBlockingQueue;

        public Consumer( MyBlockingQueue myBlockingQueue) {
            super("Consumer");
            this.myBlockingQueue = myBlockingQueue;
        }
        @Override
        public void run() {
            for (int i = 0; i <10 ; i++) {
                myBlockingQueue.take();
            }

        }
    }

    static class MyBlockingQueue{
        private Queue queue;
        private int max =16;
        private ReentrantLock reentrantLock = new ReentrantLock(true);
        private Condition notEmpty = reentrantLock.newCondition();
        private Condition notFull = reentrantLock.newCondition();
        private final Random theRandom = new Random();
        public MyBlockingQueue(int max) {
            this.queue = new LinkedList();
            this.max = max;
        }
        public void put(){
            reentrantLock.lock();
            try {
                while(queue.size() == max){
                    System.out.println(Thread.currentThread().getName()
                            + " : Buffer is full, waiting");
                    notFull.await();
                }
                int number = theRandom.nextInt();
                boolean isAdded = queue.offer(number);
                if (isAdded) {
                    System.out.printf("%s added %d into queue %n", Thread.currentThread().getName(), number);

                    notEmpty.signalAll();
                }

            } catch (InterruptedException e1) {
                e1.printStackTrace();
            } finally {
                reentrantLock.unlock();

            }

        }
        public void take(){
            reentrantLock.lock();
            try {
                while (queue.size() == 0){
                    System.out.println(Thread.currentThread().getName() + " " +
                            ": Buffer is empty, waiting");
                    notEmpty.await();
                }
                Integer value = (Integer) queue.poll();
                if (value != null) {
                    System.out.printf("%s consumed %d from queue %n",
                            Thread.currentThread().getName(), value);
                    notFull.signalAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                reentrantLock.unlock();
            }

        }
    }
}
