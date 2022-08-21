package com.sreenu.DataStructures.hackerrank.smartInterviews.Contest;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by SreenUNaik on 30-Aug-20.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class Finding_the_Ceil {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i <n ; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int q = sc.nextInt();
        for (int i = 0; i <q ; i++) {
            int x = sc.nextInt();
            System.out.println(useBinarySearchForFloor(a,x,n));
        }
    }

    private static int useBinarySearchForFloor(int[] a, int x, int n) {
        int low =0,high = n-1,mid,ans = Integer.MAX_VALUE;
        while (low<=high){
            mid = (low+high)/2;
            if (a[mid]>=x){
                high = mid-1;
                ans = a[mid];
            }else{

                low = mid+1;
            }
        }
        return ans;
    }
}