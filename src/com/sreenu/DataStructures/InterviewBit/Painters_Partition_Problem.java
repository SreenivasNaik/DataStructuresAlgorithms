package com.sreenu.DataStructures.InterviewBit;

/**
 * Created by SreenUNaik on 29-Aug-20.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class Painters_Partition_Problem {
    public static void main(String[] args) {

    }
    public int paint(int c, int b, int[] a) {
        long MOD = 10000003;
        int left = Integer.MAX_VALUE;
        int right = 0;
        long ans = 0;
        for(int i = 0 ; i < a.length ; i++){
            if(left > a[i]){
                left = a[i];
            }
            right += a[i];
        }

        while(left <= right){
            int mid = (left + right) / 2;

            int count = 0;
            int subSum = 0;
            for(int i = 0 ; i < a.length ; i++){

                if(a[i] > mid){
                    count = c;
                    break;
                }

                subSum += a[i];

                if(subSum > mid){
                    count++;
                    subSum = a[i];
                }
            }
            count++;

            if(count <= c){
                ans = mid;
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return (int)(((ans % MOD) * (long)b) % MOD);
    }
}

