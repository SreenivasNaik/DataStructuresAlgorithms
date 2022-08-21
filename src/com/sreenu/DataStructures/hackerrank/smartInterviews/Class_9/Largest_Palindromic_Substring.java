package com.sreenu.DataStructures.hackerrank.smartInterviews.Class_9;

import java.io.*;

/**
 * Created by SreenUNaik on 31-Aug-20.
 * Problem : https://www.hackerrank.com/contests/smart-interviews/challenges/si-largest-palindromic-substring
 * Time Complexity : N*N
 * Space Complexity : 1
 */
public class Largest_Palindromic_Substring {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int tc =Integer.parseInt(br.readLine());
        for (int i = 0; i <tc ; i++) {
            int size = Integer.parseInt(br.readLine());
            String s = br.readLine();
            bw.write(findLengthOfLargestPalindromicSubString(s,size)+"");
            bw.write("\n");
        }
        bw.flush();

    }

    private static int findLengthOfLargestPalindromicSubString(String s, int size) {
        if(s==null || s.length()<1) return 0;
        int max=0;
        s=s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandFromMiddle(s,i,i);
            int len2 = expandFromMiddle(s,i,i+1);
           int localMax= Math.max(len1,len2);
           max = Math.max(localMax,max);
        }
        return max;
    }

    private static int expandFromMiddle(String s, int left, int right) {
        if (s==null || left>right) return 0;
        while (left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }
}
