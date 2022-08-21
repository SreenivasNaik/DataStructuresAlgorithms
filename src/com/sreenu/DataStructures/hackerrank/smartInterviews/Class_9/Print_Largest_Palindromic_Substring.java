package com.sreenu.DataStructures.hackerrank.smartInterviews.Class_9;

import java.io.*;

/**
 * Created by SreenUNaik on 31-Aug-20.
 * Problem : https://www.hackerrank.com/contests/smart-interviews/challenges/si-largest-palindromic-substring
 * Time Complexity :
 * Space Complexity :
 */
public class Print_Largest_Palindromic_Substring {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int tc =Integer.parseInt(br.readLine());
        for (int i = 0; i <tc ; i++) {
            int size = Integer.parseInt(br.readLine());
            String s = br.readLine();
            String ans = findOfLargestPalindromicSubString(s,size);
            bw.write(ans+""+"::"+ans.length());
            bw.write("\n");
        }
        bw.flush();

    }

    private static String findOfLargestPalindromicSubString(String s, int size) {
        if(s==null || s.length()<1) return "";
        int start=0;
        int end=0;
        s=s.toLowerCase();
        String polin = "";
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandFromMiddle(s,i,i);
            int len2 = expandFromMiddle(s,i,i+1);
           int localMax= Math.max(len1,len2);
           if (localMax>end-start){
               start = i-((localMax-1)/2);
               end = i+(localMax)/2;
           }
           String curentPolin = s.substring(start,end+1);
           if(polin.length()<curentPolin.length()){
               polin = curentPolin;
           }
        }
        //return s.substring(start,end+1);
        return polin;
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
