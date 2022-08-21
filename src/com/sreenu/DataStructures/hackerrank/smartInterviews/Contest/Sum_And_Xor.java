package com.sreenu.DataStructures.hackerrank.smartInterviews.Contest;

import java.util.Scanner;

/**
 * Created by SreenUNaik on 30-Aug-20.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class Sum_And_Xor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < tc; i++) {
            long num = Long.parseLong(sc.nextLine());
            long count=0;
            int global =0;
            for (int j = 63; j >=0 ; j--) {
                if (checkBit(num,j)==1){
                    global =1;
                }
                if(checkBit(num,j)==0 && global==1){
                    count++;
                }


            }


            long ans=(long)1<<count;
            System.out.println(ans-1);
    }
    }
    static long checkBit(long n,long i){
        long two=(long)2;
        return (n>>i)%two;
    }
}
