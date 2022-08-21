package com.sreenu.DataStructures.hackerrank.smartInterviews.Class_9;

/**
 * Created by SreenUNaik on 30-Aug-20.
 * Problem : Given String convert to Uppercase or lower case
 * Time Complexity :
 * Space Complexity :
 */
public class Strings_Uppercase_LowerCase {
    public static void main(String[] args) {
        String s = "SreenivasNaik";
        convertWithNormalApporach(s);
        convertWithBitManipulation(s);
    }

    private static void convertWithBitManipulation(String s) {
        for (int i = 0; i <s.length() ; i++) {
            int a = (int)s.charAt(i);
            System.out.print(Character.toChars(a^32));

        }
        System.out.println();
    }

    private static void convertWithNormalApporach(String s) {

        for (int i = 0; i <s.length() ; i++) {
            char c = s.charAt(i);
            if((int)c >=97 && (int)c<=122){
                System.out.print(Character.toChars((int)c-32));
            }else {
                System.out.print(Character.toChars((int)c+32));
            }
        }
        System.out.println();
    }
}
