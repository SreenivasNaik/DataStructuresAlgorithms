package com.sreenu.DataStructures.hackerrank.smartInterviews.Class_3;

import java.util.Scanner;

/**
 * Created by SreenUNaik on 10-Aug-20.
 */
public class A_Power_N_Using_Recursion {
    static long M = (long)1e9+7;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfTC = Integer.parseInt(sc.nextLine());
        for(int i=0;i<numberOfTC;i++){
            String[] ab = sc.nextLine().split(" ");
            long a = Long.parseLong(ab[0]);
            long b = Long.parseLong(ab[1]);
            System.out.println(computePower(a,b));
        }
    }

    private static long computePower(long a, long b) {
       if(b==0) return 1;
       long x = (computePower(a,b/2))%M;
       if(b%2==0)
           return (((x%M)*(x%M))%M);
        else
            return ((a%M)*(x%M)*(x%M))%M;
    }
}

