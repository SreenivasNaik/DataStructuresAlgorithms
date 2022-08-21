package com.sreenu.DataStructures.hackerrank.smartInterviews.Class_3;

import java.util.Scanner;

/**
 * Created by SreenUNaik on 10-Aug-20.
 */
public class Generate_All_Parentheses_Using_BackTracking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        char ar[]= new char[2*n];
        generateAllParentheses(ar,2*n,0,0,0);
        }

    private static void generateAllParentheses(char[] ar, int N, int curIndex, int openP, int closeP) {
        if(curIndex == N){
            for(int i=0;i<N;i++){
                System.out.print(ar[i]);
            }
            System.out.println();
            return;
        }

        if(openP<N/2){
            ar[curIndex] ='(';
            generateAllParentheses(ar,N,curIndex+1,openP+1,closeP);
        }
        if(closeP<openP){
            ar[curIndex] = ')';
            generateAllParentheses(ar,N,curIndex+1,openP,closeP+1);
        }
    }

}
