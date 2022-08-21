package com.sreenu.DataStructures.hackerrank.smartInterviews.Class_10;

import java.io.*;

/**
 * Created by SreenUNaik on 05-Sep-20.
 * Problem : https://www.hackerrank.com/contests/smart-interviews/challenges/si-rabin-karp-string-matching-algorithm
 * Time Complexity : O(N+M)
 * Space Complexity :Max(n,M)
 */
public class Rabin_Karp_String_Matching_Algorithm {
    static  int P = 107;
    static int Z = (int) 1e9+7;

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int tc = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < tc; i++) {
            int count =0;
            String ar[] = bufferedReader.readLine().split(" ");
            String a = ar[0];
            String b = ar[1];
            long power[] = calcPowersofP(P,Math.max(a.length(),b.length())+1);
            long hashOfA = calcHashOfA(a,power);
            long hashOfB_length_A = calcHashOfB_at_A_length(b,a.length(),power);
            if (hashOfA == hashOfB_length_A)
                count++;
           count = count+ loopAllRemainingSubStringLengthA(b,a,hashOfA,hashOfB_length_A,power);
            bufferedWriter.write(""+count+"\n");

        }
        bufferedWriter.flush();

    }

    private static int loopAllRemainingSubStringLengthA(String b, String a, long hashOfA, long hashOfB_length_a, long[] power) {
        int count =0;
        long currentHb = hashOfB_length_a;
        for (int i = 1; i <=b.length()-a.length() ; i++) {
            char removeElement = b.charAt(i-1);
            long removeHash = calCHash(removeElement,i-1,power);
            int addCharIndex = i+a.length()-1;
            long addHash = calCHash(b.charAt(addCharIndex),addCharIndex,power);
            currentHb = (currentHb-removeHash+addHash+Z)%Z;
            int dif =Math.abs(addCharIndex - a.length()+1);
            long Ha = (hashOfA*power[dif])%Z;
            if(Ha == currentHb)
                count++;
        }
        return count;
    }
    static long calCHash(char c,int position,long[] power){

        return ((long)c*power[position+1])%Z;
    }

    private static long calcHashOfA(String a, long[] power) {
        long HashA = 0;
        for (int i = 0; i < a.length(); i++) {
            long ascii = (long)a.charAt(i);
            HashA += (ascii*power[i+1])%Z;
        }
        return HashA%Z;
    }
    private static long calcHashOfB_at_A_length(String a, int length,long[] power) {
        long HashA = 0;
        for (int i = 0; i < length; i++) {
            long ascii = (long)a.charAt(i);
            HashA += (ascii*power[i+1])%Z;
        }
        return HashA%Z;
    }


    private static long[] calcPowersofP(int p, int i) {
        long power[]=new long[i];
        for (int j = 0; j <i ; j++) {
            if(j==0)
                power[0] = 1;
            else
                power[j] = (power[j-1]*p)%Z;
        }
        return power;
    }
}
