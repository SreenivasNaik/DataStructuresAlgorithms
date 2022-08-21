package com.sreenu.DataStructures.hackerrank.smartInterviews.class_7_8;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by SreenUNaik on 23-Aug-20.
 * Problem : https://www.hackerrank.com/contests/smart-interviews/challenges/si-sum-of-pairs/problem
 * Time Complexity :N+N
 * Space Complexity : N
 */
public class Sum_of_Pairs_Using_HashMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < testCases; i++) {
            HashMap<Long,Integer> frequencyMap = new HashMap<>();
            int size = sc.nextInt();
            long sum = sc.nextLong();
            long a[] = new long[size];
            for(int j=0;j<size;j++){
                a[j] = sc.nextLong();
                if(frequencyMap.containsKey(a[j])){
                    int val = frequencyMap.get(a[j])+1;
                    frequencyMap.put(a[j],val);
                }else{
                    frequencyMap.put(a[j],1);
                }
            }
            System.out.println(sumOfPairsUsingHashMap(a,size,sum,frequencyMap));

        }
    }

    private static String sumOfPairsUsingHashMap(long[] ar, int size, long sum, HashMap<Long, Integer> frequencyMap) {
        for (int i=0;i<size;i++){
            long a = ar[i];
            long b = sum - a;

            if(frequencyMap.containsKey(b) && a!=b){
                return "True";
            }
            if(a==b && frequencyMap.containsKey(b) && frequencyMap.get(b)>1){
                return "True";
            }
        }
        return "Flase";
    }

}
