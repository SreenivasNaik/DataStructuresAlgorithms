package com.sreenu.DataStructures.codeForce;

import java.util.Scanner;

/**
 * Created by SreenUNaik on 09-Mar-20.
 */
public class Problem1A {

        static Scanner sr = new Scanner(System.in);
        public static void main(String args[])
        {
            //takes in the dimensions of the square and tiles
            double n = sr.nextInt();
            double m = sr.nextInt();
            double a = sr.nextInt();

            //calculates the biggest properly sized square with those tiles
            System.out.println((long)(Math.ceil(n/a) * Math.ceil(m/a)));
        }


    }

