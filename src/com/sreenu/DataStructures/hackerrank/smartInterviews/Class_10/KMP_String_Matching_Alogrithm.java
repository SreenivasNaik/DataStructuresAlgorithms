package com.sreenu.DataStructures.hackerrank.smartInterviews.Class_10;

import java.io.*;

/**
 * Created by SreenUNaik on 15-Sep-20.
 * Problem : https://www.hackerrank.com/contests/smart-interviews/challenges/si-kmp-string-matching-algorithm
 * Time Complexity :
 * Space Complexity :
 */
public class KMP_String_Matching_Alogrithm {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int tc = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i <tc ; i++) {
            String a[] = bufferedReader.readLine().split(" ");
            String pat = a[0];
            String str = a[1];
            int patSufixPrefixTable[] =  constuctPatSufixPrefixTable(pat);
            int count =doKMPStringMatching(pat.toCharArray(),str.toCharArray(),patSufixPrefixTable);
            bufferedWriter.write(""+count+"\n");
        }
        bufferedWriter.flush();
    }

    private static int doKMPStringMatching(char[] patern, char[] search, int[] patSufixPrefixTable) {
        int count =0;
        int i=0,j=0;
        while (i<search.length &&j<patern.length){
            if(search[i] == patern[j]){
                i++;
                j++;
            }else{
                if (j!=0){
                    j= patSufixPrefixTable[j-1];
                }else {
                    i++;
                }
            }
            if(j==patern.length){
                count++;
                j=0;
                i--;
            }
        }
        return count;
    }

    private static int[] constuctPatSufixPrefixTable(String pat) {
        int patSufixPrefixTable[] = new int[pat.length()];
       int index= 0;
        for (int i = 1; i < pat.length();) {
            if (pat.charAt(i) == pat.charAt(index)){
                patSufixPrefixTable[i] = index+1;
                index++;
                i++;
            }else {
                if(index!=0){
                    index = patSufixPrefixTable[index-1];
                }else {
                    patSufixPrefixTable[i]=0;
                    i++;
                }
            }
        }
        return patSufixPrefixTable;
    }
}
