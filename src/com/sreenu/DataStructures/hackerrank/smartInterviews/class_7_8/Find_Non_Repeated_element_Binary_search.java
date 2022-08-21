package com.sreenu.DataStructures.hackerrank.smartInterviews.class_7_8;

import java.util.Scanner;

/**
 * Created by SreenUNaik on 22-Aug-20.
 * Problem : Given array each element is repeating twice execpt one. find the non repeated element in array
 * Time Complexity :
 * Space Complexity :
 */
public class Find_Non_Repeated_element_Binary_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < testCases; i++) {

            int size = sc.nextInt();
            long a[] = new long[size];
            for (int j = 0; j < size; j++) {
                a[j] = sc.nextLong();
            }
        }
    }
}
