package com.sreenu.DataStructures.hackerrank.smartInterviews.Heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Created by SreenUNaik on 13-Feb-21.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class FindKLargestNumbersUsingHeaps {
    public  static List<Integer> findKLargestElementsUsingMinHeap(int[] arr,int k){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            minHeap.add(arr[i]);
        }
        for (int i = k; i <arr.length ; i++) {
            if (arr[i]>minHeap.peek()){
                minHeap.poll();
                minHeap.add(arr[i]);
            }
        }
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i <k ; i++) {
            integers.add(minHeap.poll());
        }

        return integers;

    }
    public static void main(String[] args) {
        int arr[] ={1,4,2,5,6,7,0};
        int k =4;
        System.out.println(findKLargestElementsUsingMaxHeap(arr,k));
        System.out.println(findKLargestElementsUsingMinHeap(arr,k));
    }
    public static List<Integer> findKLargestElementsUsingMaxHeap(int[] arr,int k){
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            maxHeap.add(arr[i]);
        }
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i <k ; i++) {
            integers.add(maxHeap.poll());
        }

        return integers;
    }
}
