package com.sreenu.DataStructures.hackerrank.smartInterviews.Class_3;

import java.util.Scanner;

/**
 * Created by SreenUNaik on 10-Aug-20.
 */
//https://www.hackerrank.com/contests/smart-interviews/challenges/si-subset-sum
public class GenerateAllSubsetsOfTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < testCases; i++) {
           /* String[] sizeSum = sc.nextLine().split(" ");
            int arraySize = Integer.parseInt(sizeSum[0]);
            int sum = Integer.parseInt(sizeSum[1]);*/
            String[] arrayElements = sc.nextLine().split(" ");
         isSubSetPresent(arrayElements, arrayElements.length, 0);
        }
    }

    private static void isSubSetPresent(String[] arrayElements, int arraySize, int sum) {

        for (int i = 0; i < (1 << arraySize); i++) {
            for (int j = 0; j < arraySize; j++) {
                if (checkBit(i, j)) {
                   System.out.print( Integer.parseInt(arrayElements[j])+" ");
                }
            }
            System.out.println();
        }

    }

    private static boolean checkBit(long inputNumber, int bitPosition) {
        return ((inputNumber >> bitPosition) & 1) != 0;
    }
}
