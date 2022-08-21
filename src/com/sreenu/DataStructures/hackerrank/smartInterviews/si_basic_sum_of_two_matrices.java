package com.sreenu.DataStructures.hackerrank.smartInterviews;

import java.util.Scanner;

/**
 * Created by SreenUNaik on 18-Mar-20.
 */
public class si_basic_sum_of_two_matrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m =sc.nextInt();
        int a[] = new int[2*n*m];
        for(int i=0;i<2*n*m;i++){
            a[i] = sc.nextInt();
        }
        long sum[] = new long[n*m];
        sumOfMatrix(n, m, a, sum);
        printResult(n, m, sum);
    }

    private static void printResult(int n, int m, long[] sum) {
        for(int i=0;i<n*m;i++){
            //System.out.print(sum[i]+" ");
            if(i==0){
                System.out.print(sum[i]+" ");
            }else if(i%m==0){
                System.out.println();
            }
            if(i!=0){
                System.out.print(sum[i]+" ");
            }


        }
    }

    private static void sumOfMatrix(int n, int m, int[] a, long[] sum) {
        int sec = (n*m);
        for(int i=0;i<n*m;i++){
            sum[i] = a[i]+a[sec];
            sec++;
        }
    }

}
