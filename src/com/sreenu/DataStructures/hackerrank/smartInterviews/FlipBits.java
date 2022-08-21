package com.sreenu.DataStructures.hackerrank.smartInterviews;

/**
 * Created by SreenUNaik on 06-Aug-20.
 */
import java.io.*;
//https://www.hackerrank.com/contests/smart-interviews/challenges/si-flip-bits
import java.util.*;

public class FlipBits {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int tc = Integer.parseInt(sc.nextLine());
        for(int i =0;i<tc;i++){
            String s[] = sc.nextLine().split(" ");
            long a =Long.parseLong(s[0]);
            long b = Long.parseLong(s[1]);
            System.out.println(countSetBits(a^b));
        }
    }
    static long countSetBits(long n){
        long c=0;
        while(n!=0){
            c++;
            n&=(n-1);
        }
        return c;
    }
}