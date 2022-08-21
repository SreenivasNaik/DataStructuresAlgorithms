package com.sreenu.DataStructures.InterviewBit;

import java.util.Collections;

/**
 * Created by SreenUNaik on 01-Sep-20.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class Min_XOR_value {
    public static void main(String[] args) {
        int a[] = new int[]{0, 2, 5, 7};
        System.out.println(findMinXor(a));
    }
    public static int findMinXor(int[] a) {
        int min = Integer.MAX_VALUE;
        java.util.Arrays.sort(a);
        for(int i=0;i<a.length-1;i++){
            min=Math.min(min,a[i]^a[i+1]);
        }
        return min;
    }
}
