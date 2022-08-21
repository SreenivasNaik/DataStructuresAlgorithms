package com.sreenu.DataStructures.hackerrank.smartInterviews.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by SreenUNaik on 19-Oct-20.
 * Problem : https://www.hackerrank.com/contests/smart-interviews/challenges/si-number-of-dice-rolls-for-given-sum
 * Time Complexity :
 * Space Complexity :
 */
public class DiceRollsGivenSum_DP {
    static long e = (long) (1e9+7);
    static int inp = 100000;
    static long dpArr[] = constructDPArray(inp);
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            int n = Integer.parseInt(br.readLine());
            System.out.println(dpArr[n]);
        }
    }

    private static long[] constructDPArray(int inp) {
        long[] dparr = new long[inp+1];
        dparr[0] =1;
        for (int i = 1; i <=inp ; i++) {
            for (int j = 1; j <= 6  && (i-j)>=0 ; j++) {
                dparr[i] = (dparr[i]+dparr[i-j])%e;
            }
        }
        return dparr;
    }
}
