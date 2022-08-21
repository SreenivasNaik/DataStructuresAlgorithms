package com.sreenu.DataStructures.hackerrank.smartInterviews.Class_9;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by SreenUNaik on 30-Aug-20.
 * Problem : find the length of longest subArray whose elements can be reArrange in contigeous order
 * Note:  Duplicates in Array
 * Time Complexity : N^2
 * Space Complexity : N
 */
public class Find_Length_of_longest_subArray_contigeoues_order_with_Duplicates {
    public static void main(String[] args) {
        //int a[] = new int[]{3,10,8,9,8,7,5,6,9,15,14,12,13,-5,-4,-3};
        Scanner sc = new Scanner(System.in);
        int tc = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < tc; i++) {
            int n = Integer.parseInt(sc.nextLine());
            int a[] = new int[n];
            String s[] = sc.nextLine().split(" ");
            for (int j = 0; j < n; j++) {
                a[j] =Integer.parseInt(s[j]);

            }
            System.out.println(solveLongestSubArrayContigeouesOrder(a,a.length));
        }

    }

    private static int solveLongestSubArrayContigeouesOrder(int[] a, int n) {
        int ans =0;
        for (int i = 0; i <n ; i++) {
            int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
            HashSet<Integer> set = new HashSet<>();
            for (int j = i; j < n; j++) {
                if(set.contains(a[j])){
                    break;
                }else {
                    set.add(a[j]);
                }
                min = Math.min(min,a[j]);
                max = Math.max(max,a[j]);
                if(max-min+1 == j-i+1)
                    ans = Math.max(ans,j-i+1);

            }
        }
        return ans;
    }
}
