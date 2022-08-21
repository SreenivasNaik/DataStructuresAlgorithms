package com.sreenu.DataStructures.hackerrank.smartInterviews.class_7_8;

import java.util.Scanner;

/**
 * Created by SreenUNaik on 22-Aug-20.
 * Problem :
 * Time Complexity : LogN
 * Space Complexity : 1
 */
public class SquareRoot_Using_BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(squareRootUsingBinarySearch(n,1,n));
    }

    private static int squareRootUsingBinarySearch(int N, int low, int high) {
        int mid = (low+high)/2;
        if(mid*mid == N)
                return mid;
        if(mid*mid >N){
            return squareRootUsingBinarySearch(N,low,mid-1);
        }
        return squareRootUsingBinarySearch(N,mid+1,high);

    }
}
