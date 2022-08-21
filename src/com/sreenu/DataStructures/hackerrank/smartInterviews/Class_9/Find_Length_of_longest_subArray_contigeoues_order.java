package com.sreenu.DataStructures.hackerrank.smartInterviews.Class_9;

/**
 * Created by SreenUNaik on 30-Aug-20.
 * Problem : find the length of longest subArray whose elements can be reArrange in contigeous order
 * Note: No Duplicates in Array
 * Time Complexity : N^2
 * Space Complexity : 1
 */
public class Find_Length_of_longest_subArray_contigeoues_order {
    public static void main(String[] args) {
        int a[] = new int[]{3,-1,5,8,7,6,10,15,9,-2,-4,-3,17,16,18};
        System.out.println(solveLongestSubArrayContigeouesOrder(a,a.length));
    }

    private static int solveLongestSubArrayContigeouesOrder(int[] a, int n) {
        int ans =0;
        for (int i = 0; i <n ; i++) {
            int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
            for (int j = i; j < n; j++) {
                min = Math.min(min,a[j]);
                max = Math.max(max,a[j]);
                if(max-min+1 == j-i+1)
                    ans = Math.max(ans,j-i+1);

            }
        }
        return ans;
    }
}
