package com.sreenu.DataStructures.hackerrank.smartInterviews.Class_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by SreenUNaik on 10-Aug-20.
 */
public class Different_bits_sum_pairwise {
    static long M = (long)1e9+7;
    public static long cntBits(ArrayList<Integer> A) {
        int ans =0;
        for(int i=0;i<31;i++){
            int set =0;
            for (int j=0;j<A.size();j++){
                if(checkBit(A.get(j),i)==true){
                    set++;
                }
                ans = (set*(A.size()-set))*(1<<i);
            }
        }
    return 2*ans;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
        String ar [] = sc.nextLine().split(" ");
        for(int i=0;i<ar.length;i++)
            a.add(Integer.parseInt(ar[i]));
        System.out.println(cntBits(a));
    }
    private static boolean checkBit(long inputNumber, int bitPosition) {
        long shift = (inputNumber>>bitPosition)&1;
        return  shift!=0;
    }
}
