package com.sreenu.DataStructures.hackerrank.smartInterviews.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by SreenUNaik on 19-Oct-20.
 * Problem : https://www.hackerrank.com/contests/smart-interviews/challenges/si-binary-strings-with-no-adjacent-1s
 * Time Complexity :
 * Space Complexity :
 */
public class BinaryStringWithNoAdjacentOnes_DP {
    static long M = (long)1e9+7;
    static int inp = 100000;
    static long dpZero[] = dpZero(inp);
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            int n = Integer.parseInt(br.readLine());
            long ans = (dpZero[n]);
            System.out.println(ans);
        }
    }
    static long[] dpZero(int n){
        long dp[] = new long[n+1];
        long dp0[] = new long[n+1];
        long dp1[] = new long[n+1];
        dp0[1] = 1;
        dp1[1] = 1;
        dp[1] = 2;
        for(int i=2;i<=n;i++){
            dp0[i] = ((dp0[i-1])%M+(dp1[i-1])%M)%M;
            dp1[i] = dp0[i-1];
            dp[i] = ((dp0[i]%M)+(dp1[i]%M))%M;
        }
        return dp;
    }
}
