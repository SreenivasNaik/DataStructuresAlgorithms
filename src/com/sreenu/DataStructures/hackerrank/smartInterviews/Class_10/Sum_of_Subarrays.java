package com.sreenu.DataStructures.hackerrank.smartInterviews.Class_10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * Created by SreenUNaik on 05-Sep-20.
 * Problem : https://www.hackerrank.com/contests/smart-interviews/challenges/si-sum-of-subarrays/
 * Time Complexity : N+Q
 * Space Complexity : N
 */
public class Sum_of_Subarrays {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N =Integer.parseInt(br.readLine());
        int a[] = new int[N];
        long c[] = new long[N];
        String ar[] = br.readLine().split(" ");
        for (int i = 0; i <N ; i++) {
            a[i] = Integer.parseInt(ar[i]);
            if(i==0)
            c[i]=a[i];
            else{
                c[i] = c[i-1]+a[i];
            }
        }
        int Q = Integer.parseInt(br.readLine());

        for (int i = 0; i < Q ; i++) {
            String ij[] = br.readLine().split(" ");
           int k = Integer.parseInt(ij[0]);
           int  l= Integer.parseInt(ij[1]);
           long sum = sumOfSubArrays(c,k,l,a);
           bw.write(""+sum+"\n");
        }
        bw.flush();

    }

    private static long sumOfSubArrays(long[] c, int k, int l, int[] a) {
        if(k==l){
            return a[k];
        }
        if(k==0)
        return  c[l];
        else
           return c[l]-c[k-1];
    }
}
