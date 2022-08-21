package com.sreenu.DataStructures.hackerrank.smartInterviews.Class_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by SreenUNaik on 10-Aug-20.
 */
public class Generate_All_Parentheses_Using_BackTracking_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        char ar[]= new char[2*n];
        generateParenthesis(n);
        System.out.println(Arrays.toString(params.toArray()));
        }

    static ArrayList<String> params = new ArrayList<>();
    public static ArrayList<String>  generateParenthesis(int A) {
        char ar[]= new char[2*A];
        generateAllParentheses(ar,2*A,0,0,0);
        return params;
    }
    private static void generateAllParentheses(char[] ar, int N, int curIndex, int openP, int closeP) {
        if(curIndex == N){
            String x ="";
            for(int i=0;i<N;i++){
                x=x+ar[i];
            }
            params.add(x);
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



