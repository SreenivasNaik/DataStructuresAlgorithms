package com.sreenu.DataStructures.InterviewBit;

/**
 * Created by SreenUNaik on 31-Aug-20.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class Palindrome_String {
    public static void main(String[] args) {
        String s ="A man, a plan, a canal: Panama";


        System.out.println(isPolindrome(s));
    }
    private static int isPolindrome(String s) {
        s = s.trim().toLowerCase().replaceAll("[^\\.A-Za-z0-9_]", "");
        int i = 0, j = s.length() - 1;

        while (i < j) {


            if (s.charAt(i) != s.charAt(j))
                return 0;

            i++;
            j--;
        }
        return 1;
    }
}
