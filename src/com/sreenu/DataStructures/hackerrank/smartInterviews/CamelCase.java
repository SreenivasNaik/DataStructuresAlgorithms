package com.sreenu.DataStructures.hackerrank.smartInterviews;

/**
 * Created by SreenUNaik on 02-Sep-20.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class CamelCase {
    public static void main(String[] args) {
        System.out.println("L"+camelcase("saveChangesInTheEditor"));
    }
    static int camelcase(String s) {
     String p[]  =   s.split("[A-Z]");
       return p.length;

    }
}

