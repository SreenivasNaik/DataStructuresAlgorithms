package com.sreenu.DataStructures.hackerrank.smartInterviews.Contest;

import java.util.Scanner;

/**
 * Created by SreenUNaik on 30-Aug-20.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class Powerful_Subsets {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int tc = sc.nextInt();
        for (int i = 0; i <tc ; i++) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int j = 0; j <n ; j++) {
            a[j] = sc.nextInt();
            }
            System.out.println(checkSubsetPresent(a,n));
        }
    }

    private static String checkSubsetPresent(int[] a, int n) {
        for (int i = 0; i < (1 << n); i++) {
            int currentSum =Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                if (checkBit(i, j)) {
                    currentSum = currentSum &a[j];
                }
            }
           // System.out.println(currentSum);
            if(currentSum!=0 && ((currentSum&(currentSum-1)) == 0)){
                return "Yes";
            }
    }
    return "No";
    }
        private static boolean checkBit(long inputNumber, int bitPosition) {
            return ((inputNumber >> bitPosition) & 1) != 0;
        }
}
