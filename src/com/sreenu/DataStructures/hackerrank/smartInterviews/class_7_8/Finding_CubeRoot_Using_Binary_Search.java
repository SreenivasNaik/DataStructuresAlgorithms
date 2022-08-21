package com.sreenu.DataStructures.hackerrank.smartInterviews.class_7_8;

import java.util.Scanner;

/**
 * Created by SreenUNaik on 23-Aug-20.
 * Problem : https://www.hackerrank.com/contests/smart-interviews/challenges/si-finding-cuberoot
 * Time Complexity : logN
 * Space Complexity : 1
 */

import java.util.Scanner;

public class Finding_CubeRoot_Using_Binary_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < testCases; i++) {
            long n = sc.nextLong();
            long x = Math.abs(n);
            if (n<0){
                System.out.println("-"+qubeRootUsingBinarySearch(x,0,1000000));
            }else {
                System.out.println(qubeRootUsingBinarySearch(x, 0, 1000000));
            }

        }
    }
    private static long qubeRootUsingBinarySearch(long N, long low, long high) {
        long mid = (low+high)/2;
        if(mid*mid*mid == N)
            return mid;
        if(mid*mid*mid >N){
            return qubeRootUsingBinarySearch(N,low,mid-1);
        }
        return qubeRootUsingBinarySearch(N,mid+1,high);

    }
}

