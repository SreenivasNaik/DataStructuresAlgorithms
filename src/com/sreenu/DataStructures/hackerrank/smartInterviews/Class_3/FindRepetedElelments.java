package com.sreenu.DataStructures.hackerrank.smartInterviews.Class_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by SreenUNaik on 10-Aug-20.
 */
//https://www.interviewbit.com/problems/repeat-and-missing-number-array/
public class FindRepetedElelments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = Integer.parseInt(sc.nextLine());
        for(int j=0;j<tc;j++){
            int size = Integer.parseInt(sc.nextLine());
            String n[] =  sc.nextLine().split(" ");
           ArrayList<Integer> array = repeatedNumber(n);
            for (int i = 0; i <array.size() ; i++) {
                if(i==(array.size()-1)){
                    System.out.println(array.get(i));
                }else {
                    System.out.print(array.get(i) + " ");
                }
            }
        }



    }

    public static ArrayList<Integer> repeatedNumber(final String[] A) {

        int n = A.length;
        int check[] = new int[n+2];
        int twice = 0;
        int missing =0;
        for(int i = 0; i<n; i++){
            if (check[Integer.parseInt( A[i])] ==  0)
            {
                check[Integer.parseInt( A[i])] = 1;
            }
            else
            {
                check[Integer.parseInt( A[i])] = check[Integer.parseInt( A[i])]+1;
            }
        }
        ArrayList<Integer> result= new ArrayList<Integer>(2);
        for(int j =1; j<n+2; j++){
            if (check[j] >1)
            {
               result.add(j);
            }
        }



        return result;


}


}
