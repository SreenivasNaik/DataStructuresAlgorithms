package com.sreenu.DataStructures.hackerrank.smartInterviews.Class_5_6;

import java.util.Scanner;

/**
 * Created by SreenUNaik on 19-Aug-20.
 * https://www.hackerrank.com/contests/smart-interviews/challenges/si-sum-of-pairs/submissions/code/1325805727
 * Time complexity : NLogN + N
 * Space Complexity : N -> MergeSort
 *
 */

public class SumOfPairs_using_Two_Pointers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < testCases; i++) {

                int size = sc.nextInt();
                long sum = sc.nextLong();
                long a[] = new long[size];
                for(int j=0;j<size;j++){
                    a[j] = sc.nextLong();
                }
                doMergesort(a,0,size-1);
            System.out.println(applyTwoPonterTechnique(a,size,sum));

        }
    }

    private static String applyTwoPonterTechnique(long[] a,int size,long sum) {
        int p1 = 0,p2=size-1;
        for (int m=0;m<size;m++){
            if(a[p1]+a[p2]==sum && p1!=p2){
                return "True";
            }else if(a[p1]+a[p2]<sum){
                p1++;
            }else {
                p2--;
            }
        }
return  "False";
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
