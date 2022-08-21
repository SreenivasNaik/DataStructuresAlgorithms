package com.sreenu.DataStructures.hackerrank.smartInterviews.Class_3;

import java.util.Scanner;

/**
 * Created by SreenUNaik on 24-Aug-20.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class Magic_square {
    static int ans;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new  int[9];
        for (int i = 0; i <9 ; i++) {
            a[i] = sc.nextInt();
        }
        boolean taken[] = new boolean[10];
        formMagicSquare(a,taken,0);
    }

    private static void formMagicSquare(int[] a, boolean[] taken, int index) {
     /*   if(index ==9){
          //  if (isMagicSquare(a)){
                ans = Math.min(ans,cost(ip,a));
                return;
            }
        }
        for (int i = 1; i <=9 ; i++) {
            if(taken[i] == false){
                taken[i] = true;

            }
        }*/
    }
}
