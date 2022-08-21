package com.sreenu.DataStructures.hackerrank.smartInterviews.Class_5_6;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by SreenUNaik on 15-Aug-20.
 * https://www.hackerrank.com/contests/smart-interviews/chal2lenges/si-triple-trouble
 */

public class Triple_Trouble_using_merge_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        for (int i = 0; i < testCases; i++) {
          int size = sc.nextInt();
           long a[] = new long[size];
           for(int j=0;j<size;j++){
               a[j] = sc.nextLong();
           }

            doMergeSort(a, 0,size-1);
        //    System.out.println(Arrays.toString(a));
            HashMap<Long,Integer> count = new HashMap<>();
            for(int k=0;k<size;k++)
            {
                if(count.containsKey(a[k])){
                    int value = count.get(a[k])+1;
                    count.put(a[k],value);
                }else {
                    count.put(a[k],1);
                }
            }
           count.forEach((key,value)->
           {
               if(value ==1){
                   System.out.println(key);

               }

           });

        }
    }

    private static void doMergeSort(long[] a, int low, int high) {
        if(low == high)
            return;
        int mid = (low+high)/2;
        doMergeSort(a,low,mid);
        doMergeSort(a,mid+1,high);
        mergeSortedArrays(a,low,high);

    }

    private static void mergeSortedArrays(long[] a, int low, int high) {
        int mid= (low+high)/2;
        long temp[] = new long[high-low+1];
        int p1=low,p2=mid+1,k=0;
        while (p1<=mid && p2<=high){
            if (a[p1]<a[p2])
                temp[k++] = a[p1++];
            else
                temp[k++] = a[p2++];
        }
        while (p1<=mid){
            temp[k++] = a[p1++];
        }
        while (p2<=high){
            temp[k++] = a[p2++];
        }
        for (int i = 0; i <k ; i++) {
            a[low+i] =  temp[i];
        }
    }
}
