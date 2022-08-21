package com.sreenu.DataStructures.hackerrank.smartInterviews.class_7_8;

/**
 * Created by SreenUNaik on 29-Aug-20.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class Matrix_Median {
    public static void main(String[] args) {
        int a[] = new int[]{3,10,10,12,20,23};
        int b[] = new int[]{-4,-2,7,11,13,14,16,17,18};
        System.out.println(findMidean(a,b,a.length,b.length));
    }

    private static int findMidean(int[] a, int[] b, int N, int M) {
        int low = Math.min(a[0],b[0]);
        int high = Math.max(a[N-1],b[M-1]);
        int midean = 0;
        while (low<=high){
            int mid= (low+high)/2;
            int less = findLessThanMidBS(a,N,mid)+findLessThanMidBS(b,M,mid);
            int greater = findGreaterThanMid(a,N,mid)+findGreaterThanMid(b,M,mid);
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
