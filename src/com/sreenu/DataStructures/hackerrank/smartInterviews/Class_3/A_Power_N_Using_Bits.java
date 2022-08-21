package com.sreenu.DataStructures.hackerrank.smartInterviews.Class_3;

import java.util.Scanner;

/**
 * Created by SreenUNaik on 10-Aug-20.
 */
public class A_Power_N_Using_Bits {
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
        long x = a; long ans =1;
        for(int i=0;i<31;i++){
            if(checkBit(b,i)==true){
                ans = (long)(((ans%M)*(x%M))%M);
                //ans = ans*x;
            }
            x = (long)(x%M);
            x=(long) ((x*x)%M);

        }
       // ans = (long)(ans%M);
        return ans;
    }

    private static boolean checkBit(long inputNumber, int bitPosition) {
       long shift = (inputNumber>>bitPosition)&1;
        return  shift!=0;
    }

}
