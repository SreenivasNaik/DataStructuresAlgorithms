package com.sreenu.DataStructures.hackerrank.smartInterviews.class_7_8;

import java.util.Scanner;

/**
 * Created by SreenUNaik on 23-Aug-20.
 * Problem : https://www.hackerrank.com/contests/smart-interviews/challenges/si-cabinets-partitioning
 * Time Complexity :
 * Space Complexity :
 */
public class Cabinets_Partitioning_using_BackTracking {
    static int ans= Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < testCases; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
            }
            int ans =0;
            UseBackTrackForPartition(a,n,k,0,0);
            System.out.println(ans);
        }
    }

    private static void UseBackTrackForPartition(int[] a, int size, int numberOfWorkers, int curAns, int index) {
        if(numberOfWorkers ==1){
            curAns = Math.max(curAns,sum(a,index,size));

            ans =Math.min(curAns,ans);

            return;
        }
        int sum =0;
        for (int i = 0; i <size ; i++) {
            sum+=a[i];
            curAns = Math.max(curAns,sum);
            UseBackTrackForPartition(a,size,numberOfWorkers-1,curAns,i+1);
        }
    }

    private static int sum(int[] a, int index, int size) {
        int sum =0;
        for (int i = index; i < size; i++) {
            sum+=a[i];
        }
        return sum;
    }
}
