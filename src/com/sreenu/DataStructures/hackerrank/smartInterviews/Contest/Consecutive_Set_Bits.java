package com.sreenu.DataStructures.hackerrank.smartInterviews.Contest;

import java.util.Scanner;

/**
 * Created by SreenUNaik on 30-Aug-20.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class Consecutive_Set_Bits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < tc; i++)
        {
            long num = Long.parseLong(sc.nextLine());
            int count =0;
            int currentAns =0;
            for (int j = 0; j < 62 ; j++) {
                if(checkBit(num,j)==true){
                    count++;
                }else {
                   currentAns = Math.max(count,currentAns);
                    count =0;
                }
            }
            System.out.println(currentAns);

        }

    }
    private static boolean checkBit(long inputNumber, int bitPosition) {
        long shift = (inputNumber>>bitPosition)&1;
        return  shift!=0;
    }
}
