package com.sreenu.DataStructures.hackerrank.smartInterviews.Contest;

import java.util.Scanner;

/**
 * Created by SreenUNaik on 30-Aug-20.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class Even_Split {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < tc; i++)
        {
            long num = Long.parseLong(sc.nextLine());
            if(num%2==0 && num!=2){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }

    }

}
