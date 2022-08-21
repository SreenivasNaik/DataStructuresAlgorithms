package com.sreenu.DataStructures.hackerrank.smartInterviews.Class_3;

import java.util.Scanner;

/**
 * Created by SreenUNaik on 10-Aug-20.
 */
public class FindUniqueElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n[] =  sc.nextLine().split(" ");
        int ans =0;
        for(int i=0;i<n.length;i++){
            ans = ans^(Integer.parseInt(n[i]));
        }
        System.out.println(ans);
        String s="dsd";
        String c="s";
        int count =0;
        for(int i=0;i<s.length();i++){
            if(c.equalsIgnoreCase(String.valueOf(s.charAt(i)))){
                count++;
            }
        }
    }
}
