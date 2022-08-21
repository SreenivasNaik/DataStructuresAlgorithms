package com.sreenu.DataStructures.hackerrank.smartInterviews.Class_5_6;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by SreenUNaik on 22-Aug-20.
 * Problem : https://www.hackerrank.com/contests/smart-interviews/challenges/si-finding-frequency
 * Time Complexity :
 * Space Complexity :
 */
public class Finding_Frequency_BinarySerach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long a[] = new long[N];
        for (int i = 0; i <N ; i++) {
            a[i] = sc.nextLong();
        }
        Arrays.sort(a);
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            long x = sc.nextLong();
            int count =0;

        }
    }
}
