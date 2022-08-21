package com.sreenu.DataStructures;

import java.util.PriorityQueue;
import java.util.TreeMap;

/**
 * Created by SreenUNaik on 13-Feb-21.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class WallMart_HighFive {
    public static void main(String[] args) {

    }
    public int[][] highFive(int[][] items) {
        TreeMap<Integer, PriorityQueue<Integer>> treeMap = new TreeMap<>();
        for (int[] studentToScores : items) {
            if (treeMap.containsKey(studentToScores[0])) {
                PriorityQueue<Integer> maxHeap = treeMap.get(studentToScores[0]);
                maxHeap.add(studentToScores[1]);
                if (maxHeap.size() > 5) {
                    maxHeap.poll();
                }
                treeMap.put(studentToScores[0], maxHeap);
            } else {
                PriorityQueue<Integer> maxHeap = new PriorityQueue<>();
                maxHeap.offer(studentToScores[1]);
                treeMap.put(studentToScores[0], maxHeap);
            }
        }
        int[][] result = new int[treeMap.size()][2];
        for (int id : treeMap.keySet()) {
            result[id - 1][0] = id;
            int sum = 0;
            PriorityQueue<Integer> maxHeap = treeMap.get(id);
            while (!maxHeap.isEmpty()) {
                sum += maxHeap.poll();
            }
            result[id - 1][1] = sum / 5;
        }
        return result;
    }
}

