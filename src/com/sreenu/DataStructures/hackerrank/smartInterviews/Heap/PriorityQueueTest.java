package com.sreenu.DataStructures.hackerrank.smartInterviews.Heap;

import java.util.PriorityQueue;

/**
 * Created by SreenUNaik on 13-Feb-21.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap =  new PriorityQueue<Integer>(5);
        minHeap.add(5);
        minHeap.add(4);
        minHeap.add(2);
        minHeap.add(90);
        minHeap.add(21);
        System.out.println(minHeap.peek());

    }
}
