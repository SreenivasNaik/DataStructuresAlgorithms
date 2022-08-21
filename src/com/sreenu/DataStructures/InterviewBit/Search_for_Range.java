package com.sreenu.DataStructures.InterviewBit;

import java.util.Arrays;

/**
 * Created by SreenUNaik on 27-Aug-20.
 * Problem : https://www.interviewbit.com/problems/search-for-a-range/
 * Time Complexity :
 * Space Complexity :
 */
public class Search_for_Range {
    public static void main(String[] args) {
        int a[] = new int[]{5, 7, 7, 8, 8, 10};
        int k = 8;
        Arrays.sort(a);
        System.out.println(Arrays.toString( doBSI(a,k)));
    }

    private static int[] doBSI(int[] a, int k) {
        int left = doBinarySearch(a,k,false);
        if (left == -1) {
            return new int[]{-1, -1};
        }
        return new int[]{left, doBinarySearch(a,k, true)};
    }

    private static int doBinarySearch(int[] a, int k, boolean b) {
        int low = 0;
        int high = a.length-1;
        int result =-1;
        while (low<=high){
            int mid = (low+high)/2;
            if(a[mid]==k){
                result  = mid;
                if(b){
                    low = mid+1;
                }else {
                    high = mid-1;
                }
            }else if(a[mid]<k){
                low= mid+1;
            }else {
                high = mid-1;
            }
        }
        return result;
    }
}
