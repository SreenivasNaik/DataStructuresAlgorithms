package com.sreenu.DataStructures.hackerrank.smartInterviews.Contest;

import java.util.Scanner;

/**
 * Created by SreenUNaik on 31-Aug-20.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class NoOfDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        System.out.println(noOfdivisors(num));
    }

    private static long noOfdivisors(long num) {
        long count =0;
        for (int i = 1; i <=Math.sqrt(num) ; i++) {
            if(num%i==0){
                if(num/i==i){
                    count++;
                }
                else {
                    count=count+2;
                }
            }
        }
        return count;
    }
}
