package com.sreenu.DataStructures.hackerrank.smartInterviews.Contest;

import java.util.Scanner;

/**
 * Created by SreenUNaik on 30-Aug-20.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class Check_Palindrome_Easy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < tc; i++) {
            int size = Integer.parseInt(sc.nextLine());
            String s = sc.nextLine();
            System.out.println(isPolindrome(s,size));
        }
    }

    private static String isPolindrome(String s, int size) {
        int i = 0, j = size - 1;

        while (i < j) {


            if (s.charAt(i) != s.charAt(j))
                return "No";

            i++;
            j--;
        }
        return "Yes";
    }
}
