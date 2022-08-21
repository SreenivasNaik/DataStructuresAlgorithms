package com.sreenu.DataStructures.hackerrank.smartInterviews.Class_9;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 * Created by SreenUNaik on 30-Aug-20.
 * Problem : Given array size N and window size K for each size of K subArray count no of unique numbers present
 * https://www.hackerrank.com/contests/smart-interviews/challenges/si-distinct-elements-in-window
 * Time Complexity :
 * Space Complexity :
 */
public class Count_Number_of_unique_elements_subArray_size_k {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t=Integer.parseInt(br.readLine());
        while(t-- !=0) {
            int n, k;
            String[] inp = br.readLine().split(" ");
            n = Integer.parseInt(inp[0]);
            k = Integer.parseInt(inp[1]);
            inp = br.readLine().split(" ");
            int arr[] = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = Integer.parseInt(inp[j]);
            }
            List<Integer> result = countNoOfUnqiueElementsInSubArraySizeK(arr,n,k);
            for (int j = 0; j <result.size() ; j++) {
                if(j<result.size()-1) {
                    bw.write(result.get(j) + " ");
                }else {
                    bw.write(result.get(j)+"");
                }

            }
            bw.write("\n");
        }
        bw.flush();
        }


    private static List<Integer> countNoOfUnqiueElementsInSubArraySizeK(int[] a, int size, int windowSize) {
        List<Integer> unique = new ArrayList<>();
        HashMap<Integer,Integer> countMap = new HashMap<>();
        for (int i = 0; i <windowSize ; i++) {
            countMap.put(a[i],countMap.getOrDefault(a[i],0)+1);
        }
        unique.add(countMap.size());
        for (int i = 1; i <=size-windowSize ; i++) {
            int removeElement = a[i-1];
            int addElement = a[i+windowSize-1];
            removeElementFromMap(countMap,removeElement);
            countMap.put(addElement,countMap.getOrDefault(addElement,0)+1);
            unique.add(countMap.size());
        }

    return unique;
    }

    private static void removeElementFromMap(HashMap<Integer, Integer> countMap, int removeElement) {
        Integer count = countMap.get(removeElement);
        if(count!=null &&count>1){
            countMap.put(removeElement,count-1);
        }else {
            countMap.remove(removeElement);
        }
    }
}
