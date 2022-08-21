package com.sreenu.DataStructures.InterviewBit;

/**
 * Created by SreenUNaik on 23-Aug-20.
 * Problem : https://www.interviewbit.com/problems/find-duplicate-in-array/
 * Time Complexity :
 * Space Complexity :
 */
public class Find_Duplicate_in_Array {
    public static void main(String[] args) {

    }

    public int repeatedNumber(final int[] A) {
        int i, ans = 0;
        int size = A.length;
        for (i = 0; i < size; i++) {
            if (A[Math.abs(A[i])] >= 0)
                A[Math.abs(A[i])] = -A[Math.abs(A[i])];
            else
                ans = Math.abs(A[i]);
        }
        return ans;
    }
}