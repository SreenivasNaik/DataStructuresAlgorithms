package com.sreenu.DataStructures.InterviewBit;

import java.util.Scanner;

/**
 * Created by SreenUNaik on 25-Aug-20.
 * Problem : https://www.interviewbit.com/problems/square-root-of-integer/
 * Time Complexity : logN
 * Space Complexity : 1
 */
public class Square_Root_of_Integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(squareRootUsingBinarySearch(n));
    }

    private static int squareRootUsingBinarySearch(int x) {
        if(x==1) return 1;
        int left = 1;
        int right = x/2;
        while(left<=right){
            int mid = left + (right-left)/2;
            if((long)mid*mid == (long)x) return mid;
            if((long)mid*mid > (long)x) right = mid-1;
            else left = mid+1;
        }
        return left-1;
    }
}
