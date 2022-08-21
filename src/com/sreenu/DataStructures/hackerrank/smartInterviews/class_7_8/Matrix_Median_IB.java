package com.sreenu.DataStructures.hackerrank.smartInterviews.class_7_8;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by SreenUNaik on 29-Aug-20.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class Matrix_Median_IB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();

            }
        }
        System.out.println("ans"+doMedian(a));
    }

    private static int  doMedian(int[][] a) {
       int n =  a.length;
       int m = a[0].length;
        int c[] = new int[n * m];
        int b = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                c[b] = a[i][j];
                b++;
            }
        }
        Arrays.sort(c);

return findMidean(c,n*m);
    }
    private static int findMidean(int[] a,int N) {
        int low = a[0];
        int high =a[N-1];
        int midean = 0;
        while (low<=high){
            int mid= (low+high)/2;
            System.out.println("Mid"+mid);
            int less = findLessThanMidBS(a,N,mid);
            int greater = findGreaterThanMid(a,N,mid);
            System.out.println("Less"+less);
            System.out.println("greter"+greater);
            if(less == greater) {
                midean = mid;
                break;
            }
            if(less<greater)
                low = mid+1;
            else
                high = mid-1;
        }
        return midean;
    }

    private static int findLessThanMidBS(int[] a, int n, int k) {
        int low =0,high = n-1,idx=n;
        while (low<=high){
            int mid = (low+high)/2;
            if (a[mid]<k){
                idx = mid;
                low = mid+1;

            }else {
                high = mid-1;
            }
        }
        return idx+1;

    }

    private static int findGreaterThanMid(int[] a, int n, int k) {
        int low =0,high = n-1,idx=n;
        while (low<=high){
            int mid = (low+high)/2;
            if (a[mid]>k){
                idx = mid;
                high = mid-1;
            }else {
                low = mid+1;
            }
        }
        return n-idx;
    }
}