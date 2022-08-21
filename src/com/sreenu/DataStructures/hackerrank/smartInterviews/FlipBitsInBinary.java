package com.sreenu.DataStructures.hackerrank.smartInterviews;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by SreenUNaik on 08-Aug-20.
 */
public class FlipBitsInBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.nextLine());
        System.out.println(reverse(n));
    }

    public static long reverse(long num) {
        System.out.println(~    num);
        int times = 32;
        long res =0;
        List<Long> l = new ArrayList<Long>();
        for (int i = 0; i < times; i++)
            num = num ^ (1 << i);



        return num;

    }
    }

