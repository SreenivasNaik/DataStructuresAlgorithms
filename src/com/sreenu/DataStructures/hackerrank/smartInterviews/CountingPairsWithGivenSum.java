package com.sreenu.DataStructures.hackerrank.smartInterviews;

import java.util.HashMap;

/**
 * Created by SreenUNaik on 17-Mar-21.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class CountingPairsWithGivenSum {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 7, -1, 5 };
        int sum = 6;
    //CountAndPrintPairs(arr,sum);
    //Using HashMap
        HashMap<Integer,Integer> map = new HashMap<>();
//        for (int i = 0; i < arr.length; i++) {
//            if(map.containsKey(arr[i]))
//            {
//                int val = map.get(arr[i])+1;
//                map.put(arr[i],val);
//            }else {
//                map.put(arr[i],1);
//            }
//        }
        CountAndPrintPairsUsingHashMap(map,sum,arr);
    }

    private static void CountAndPrintPairsUsingHashMap(HashMap<Integer, Integer> map, int sum, int[] arr) {
        int count =0;
        for (int i = 0; i <arr.length ; i++) {
            int a = arr[i];
            int b = sum-a;
            if(map.containsKey(b)){
                int val = map.get(b);
                for (int j = 0; j <val ; j++) {
                    System.out.println("Pair::"+a+":"+b);
                }
                count++;
            }
            if(map.containsKey(arr[i]))
            {
                int val = map.get(arr[i])+1;
                map.put(arr[i],val);
            }else {
                map.put(arr[i], 1);
            }
        }
        System.out.println("Count::"+count);

    }

    //N^2
    public static void CountAndPrintPairs(int a[],int sum){
        int count =0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j <a.length ; j++) {
                if (a[i]+a[j] == sum){
                    System.out.println("Pair:"+a[i]+"::"+a[j]);
                    count++;
                }
            }
        }
        System.out.println("count:"+count);
    }
}
