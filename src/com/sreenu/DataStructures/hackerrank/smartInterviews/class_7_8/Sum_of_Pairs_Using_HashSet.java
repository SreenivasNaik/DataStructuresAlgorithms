package com.sreenu.DataStructures.hackerrank.smartInterviews.class_7_8;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by SreenUNaik on 23-Aug-20.
 * Problem :  https://www.hackerrank.com/contests/smart-interviews/challenges/si-sum-of-pairs/problem
 * Time Complexity :
 * Space Complexity :
 */
public class Sum_of_Pairs_Using_HashSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < testCases; i++) {
            HashSet<Long> set = new HashSet<>();
            int size = sc.nextInt();
            long sum = sc.nextLong();
            long a[] = new long[size];
            for(int j=0;j<size;j++){
                a[j] = sc.nextLong();

            }
            System.out.println(sumOfPairsUsingHashSet(a,size,sum,set));

        }
    }

    private static String sumOfPairsUsingHashSet(long[] ar, int size, long sum, HashSet<Long> set) {
        for (int i = 0; i < size ; i++) {
            long a = ar[i];
            long b = sum-a;
            if(set.contains(b)){
                return "True";
            }else{
                set.add(a);

            }
        }
        return "Flase";
    }
}
