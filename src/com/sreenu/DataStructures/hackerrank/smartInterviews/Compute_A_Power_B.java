package com.sreenu.DataStructures.hackerrank.smartInterviews;

import java.util.Scanner;

/**
 * Created by SreenUNaik on 18-Mar-20.
 */
public class Compute_A_Power_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long result = 1;

        while(b != 0)
        {
            result *= a;
            --b;
        }
    }

}
