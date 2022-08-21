package com.sreenu.DataStructures.hackerrank.smartInterviews.Class_5_6;

import java.util.Scanner;

/**
 * Created by SreenUNaik on 22-Aug-20.
 */
public class Pair_with_Difference_K_BinarySerach {
public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner scn = new Scanner(System.in);
            int T = scn.nextInt();
            for (int t = 0; t < T; t++) {
                int n = scn.nextInt();
                int k = scn.nextInt();
                long a[] = new long[n];

                for (int i = 0; i < n; i++) {
                    a[i] = scn.nextLong();
                }
                doMergesort(a,0,n-1);
                boolean result = twoBinarySearches(a, n, k);
                System.out.println(result);
            }

        }

        static boolean twoBinarySearches(long a[], int N, int k) {
            for (int i = 0; i < N; i++) {
                long c = a[i];
                long b = k + c;
                if (BSR(a, b, i + 1, N - 1)) {
                    return true;
                }
            }
            return false;

        }

        static boolean BSR(long a[], long k, int low, int high) {
            if (low > high) {
                return false;
            }
            int m = (low + high) / 2;
            if (a[m] == k)
                return true;
            if (k > a[m])
                return BSR(a, k, m + 1, high);
            return BSR(a, k, low, m - 1);
        }


        private static void doMergesort(long[] a, int low, int high) {
        if(low == high)
            return;
        int mid = (low+high)/2;
        doMergesort(a,low,mid);
        doMergesort(a,mid+1,high);
        MergeTheArrays(a,low,high);
    }

    private static void MergeTheArrays(long[] a, int low, int high) {
        int mid =(low+high)/2;
        long temp[] = new long[high-low+1];
        int p1 = low,p2=mid+1,k=0;
        while (p1<=mid&& p2<=high){
            if(a[p1]<a[p2])
                temp[k++] = a[p1++];
            else
                temp[k++] = a[p2++];
        }
        while (p1<=mid)
            temp[k++] = a[p1++];
        while (p2<=high)
            temp[k++] = a[p2++];

        for (int i = 0; i <k ; i++) {
            a[low+i] =  temp[i];
        }
    }
}

