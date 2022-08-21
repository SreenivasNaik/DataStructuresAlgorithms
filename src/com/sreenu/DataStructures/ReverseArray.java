package com.sreenu.DataStructures;

import java.util.Scanner;

/**
 * Created by SreenUNaik on 01-Mar-20.
 */
public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s1 = sc.nextLine();

        String s ="";
        s=s+String.valueOf(s1.charAt(0)).toUpperCase();
        for(int i=1;i<s1.length();i++){
           s+=s1.charAt(i);
        }
        System.out.println(s);
//
//        for(int i=0;i<s.length();i++)
//        {
//            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='y'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'||s.charAt(i)=='Y')
//            {
//                continue;
//            }
//            else
//            {
//                s1+='.';
//                s1+=String.valueOf(s.charAt(i)).toLowerCase();
//            }
//        }
//        System.out.println(s1);
    }



}
