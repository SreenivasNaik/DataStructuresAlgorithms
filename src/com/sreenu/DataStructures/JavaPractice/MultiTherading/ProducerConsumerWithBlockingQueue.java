package com.sreenu.DataStructures.JavaPractice.MultiTherading;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by SreenUNaik on 30-Mar-21.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class ProducerConsumerWithBlockingQueue {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);

        final Runnable producer = ()->{
            while (true){
                try {
                    queue.put(createItem());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        new Thread(producer).start();
        new Thread(producer).start();

        final Runnable consumer = ()->{
            while (true){
                try {
                    int i = queue.take();
                    System.out.println("Consumer::consumed"+i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        new Thread(consumer).start();
        new Thread(consumer).start();
        Thread.sleep(1000);
    }

    private static Integer createItem() {
        int number = new Random().nextInt();
        System.out.println("Producer::Produced"+number );
        return number;
    }
}
