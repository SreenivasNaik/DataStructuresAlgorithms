package com.sreenu.DataStructures.hackerrank.smartInterviews.Class_5_6;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by SreenUNaik on 22-Aug-20.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class Sort_two_arrays_in_one_arrat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < testCases; i++) {

            int size = sc.nextInt();
            long a[] = new long[size];
            for(int j=0;j<size;j++){
                a[j] = sc.nextLong();
            }
            int size2 = sc.nextInt();
            long b[] = new long[size2];
            for(int j=0;j<size2;j++){
                b[j] = sc.nextLong();
            }
            System.out.println(Arrays.toString(printSortedArrayUsingTwoPointers(a,size,b,size2)));

        }
    }

    private static long[] printSortedArrayUsingTwoPointers(long[] a, int n, long[] b, int m) {
        int p1=0,p2=0,k=0;
        long c[] = new long[n+m];
        while (p1<n && p2<m){
            if(a[p1]<b[p2]){
                c[k] = a[p1];
                p1++;
                k++;
            }else {
                c[k] = b[p2];
                p2++;
                k++;
            }
        }
        while (p1<n){
            c[k] = a[p1];
            p1++;
            k++;
        }
       while (p2<m){
            c[k] = b[p2];
            p2++;
            k++;
        }
        return c;
    }
}
