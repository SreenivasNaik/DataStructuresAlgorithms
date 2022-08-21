package com.sreenu.DataStructures.hackerrank.smartInterviews.Class_3;

import java.util.Scanner;

/**
 * Created by SreenUNaik on 10-Aug-20.
 */
//https://www.hackerrank.com/contests/smart-interviews/challenges/si-subset-sum
public class SubsetSumProblem_BitManipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < testCases; i++) {
            String[] sizeSum = sc.nextLine().split(" ");
            int arraySize = Integer.parseInt(sizeSum[0]);
            int sum = Integer.parseInt(sizeSum[1]);
            String[] arrayElements = sc.nextLine().split(" ");
            System.out.println(isSubSetPresent(arrayElements, arraySize, sum));
        }
    }

    private static String isSubSetPresent(String[] arrayElements, int arraySize, int sum) {
        int currentSum = 0;
        for (int i = 0; i < (1 << arraySize); i++) {
            for (int j = 0; j < arraySize; j++) {
                if (checkBit(i, j)) {
                    currentSum = currentSum + Integer.parseInt(arrayElements[j]);
                }
            }
            if (sum == currentSum)
                return "YES";
            currentSum = 0;
        }
        return "NO";
    }

    private static boolean checkBit(long inputNumber, int bitPosition) {
        return ((inputNumber >> bitPosition) & 1) != 0;
    }
}
