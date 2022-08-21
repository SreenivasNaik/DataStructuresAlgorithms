package com.sreenu.DataStructures.hackerrank.smartInterviews.class_7_8;

import java.util.Scanner;

/**
 * Created by SreenUNaik on 23-Aug-20.
 * Problem : https://www.hackerrank.com/contests/smart-interviews/challenges/si-cabinets-partitioning
 * Time Complexity : N*LogS
 * Space Complexity : 1
 */
public class Cabinets_Partitioning_using_BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < testCases; i++) {

            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
            }
            int ans =0;
            System.out.println(UseBinarySearchPartition(a,n,k));
        //    System.out.println(ans);
        }
    }
    static int max(int[] a){
        int max =a[0];
        for (int i = 1; i <a.length ; i++) {
            if(max <a[i])
                max = a[i];
        }
        return max;
    }

    static int sum(int[] a){
        int max =0;
        for (int i = 0; i <a.length ; i++) {
          max+=a[i];
        }
        return max;
    }
    private static int UseBinarySearchPartition(int[] a, int n, int k) {
        int ans =0;
        int low = max(a);
        int high = sum(a);
        while (low<=high){
            int mid = (low+high)/2;
            if (isValidPartition(a,n,mid,k)) {
                ans = mid;
                high = mid -1;
            }else {
                low= mid+1;
            }
        }
        return ans;
    }

    private static boolean isValidPartition(int[] a, int n, int mid,int k) {
        int count =0;
        int sum =0;
        for (int i = 0; i < n; i++) {
            if(sum+a[i]<=mid){
                sum+=a[i];
                if(i==n-1)
                    count++;
            }else {
                count++;
                sum=0;
                i--;
            }

        }
        if(count<=(k)){
            return  true;
        }
return false;
    }
}
