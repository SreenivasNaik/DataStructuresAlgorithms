package com.sreenu.DataStructures.InterviewBit;

import java.util.Arrays;

/**
 * Created by SreenUNaik on 25-Aug-20.
 * Problem : https://www.interviewbit.com/problems/diffk-ii/
 * https://www.interviewbit.com/problems/diffk/
 * Time Complexity :
 * Space Complexity :
 */
public class A_B_is_Equal_To_K {
    public static void main(String[] args) {
        int a[] = new int[]{1,5,3};
        int k = 2;
        System.out.println(diffPossible(a,k));
    }
    public static int diffPossible(final int[] A, int B) {
        Arrays.sort(A);
        for (int i = 0; i < A.length; i++) {
            int a = A[i];
            int b = B+a;
            if(doBinarySearchRecursive(A,b,i+1,A.length-1)==1){
                return 1;
            }
        }
        return 0;
    }

    private static int doBinarySearchRecursive(int[] a, int b, int low, int high) {
        if (low>high)
            return 0;
        int mid = (low+high)/2;
        if(a[mid]==b)
            return 1;
        if(b>a[mid])
            return doBinarySearchRecursive(a,b,mid+1,high);
        return doBinarySearchRecursive(a,b,low,high-1);
    }
}

