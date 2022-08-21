package com.sreenu.DataStructures.hackerrank.smartInterviews.DP;

import java.io.*;

/**
 * Created by SreenUNaik on 19-Oct-20.
 * Problem : https://www.hackerrank.com/contests/smart-interviews/challenges/si-compute-factorial/problem
 * Time Complexity : N
 * Space Complexity : N
 */
public class Factorial_Using_DP {
    static long M = (long)1e9+7;
    static int inp = 1000000;
    static long fact[] = solve(inp);
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int tc = Integer.parseInt(br.readLine());
        for (int i = 0; i <tc ; i++) {
            int n = Integer.parseInt(br.readLine());
            bw.write(fact[n]+"\n");
        }
        bw.flush();
    }
    static long[] solve(int n){
        long fact[] = new long[n+1];
        fact[0] = 1; // DP Base Condition
        for(int i =1;i<=n;i++){
            fact[i] = (i * fact[i-1])%M; // DP EXpression DP[i] = DP[i-1]*i
        }
        return fact;
    }
}
