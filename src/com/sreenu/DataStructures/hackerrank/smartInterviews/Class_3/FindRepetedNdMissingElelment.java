package com.sreenu.DataStructures.hackerrank.smartInterviews.Class_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by SreenUNaik on 10-Aug-20.
 */
//https://www.interviewbit.com/problems/repeat-and-missing-number-array/
public class FindRepetedNdMissingElelment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n[] =  sc.nextLine().split(" ");
        List<Integer> integers = new ArrayList<>();
        for(int i=0;i<n.length;i++)
            integers.add(Integer.parseInt(n[i]));
        System.out.println(repeatedNumber(integers));
    }

    public static ArrayList<Integer> repeatedNumber(final List<Integer> A) {

        int n = A.size();
        int check[] = new int[n+1];
        int twice = 0;
        int missing =0;
        for(int i = 0; i<n; i++){
            if (check[(int) A.get(i)] ==  0)
            {
                check[(int) A.get(i)] = 1;
            }
            else
            {
                twice = (int) A.get(i);
            }
        }
        for(int j =1; j<n+1; j++){
            if (check[j] == 0)
            {
                missing = j;
            }
        }
        ArrayList<Integer> result= new ArrayList<Integer>(2);

        result.add(twice);
        result.add(missing);

        return result;


}


}
