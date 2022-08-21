package com.sreenu.DataStructures.hackerrank.smartInterviews;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by SreenUNaik on 18-Mar-20.
 */
public class SI_Basic_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        BigInteger f = new BigInteger(num);
        BigInteger sum = new BigInteger("0");
        BigInteger zero = new BigInteger("0");
        BigInteger ten = new BigInteger("10");


        while(!f.equals(zero)){

            sum=sum.add(f.mod(ten));
            f=f.divide(ten);
        }
        System.out.println(sum);
    }
}
