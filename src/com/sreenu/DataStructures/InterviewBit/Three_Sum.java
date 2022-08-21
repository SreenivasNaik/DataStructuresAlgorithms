package com.sreenu.DataStructures.InterviewBit;

import java.util.Arrays;

/**
 * Created by SreenUNaik on 29-Aug-20.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class Three_Sum {
    public static void main(String[] args) {
        int a[]= new int[]{-1,2,1,-4};
        System.out.println(threeSumClosest(a,1));
    }
    public static int threeSumClosest(int[] A, int B) {
        Arrays.sort(A);
        int n = A.length;
        int minDiff = Integer.MAX_VALUE;
        int res = 0;
        for (int i = 0; i <n ; i++) {
            int a = A[i];
            int left = i+1,right = n-1;
            while (left<right){
                int b = A[left];
                int c = A[right];
                int sum = a+b+c;
                int diff = Math.abs(B-sum);
                if(diff ==0)
                    return sum;
                if(minDiff>diff){
                    minDiff = diff;
                    res = sum;
                }
                if(sum<=B)
                    left++;
                else if (sum>B)
                    right--;
            }
        }
return res;
    }
}
