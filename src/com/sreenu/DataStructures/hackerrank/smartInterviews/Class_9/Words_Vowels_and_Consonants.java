package com.sreenu.DataStructures.hackerrank.smartInterviews.Class_9;

import java.util.Scanner;

/**
 * Created by SreenUNaik on 31-Aug-20.
 * Problem : https://www.hackerrank.com/contests/smart-interviews/challenges/si-words-vowels-and-consonants
 * Time Complexity :
 * Space Complexity :
 */
public class Words_Vowels_and_Consonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc =Integer.parseInt(sc.nextLine());
        for (int i = 0; i <tc ; i++) {
            String s = sc.nextLine();
             printNoOfWords_Vowels_and_Consonants(s);

        }
    }

    private static void  printNoOfWords_Vowels_and_Consonants(String s) {
        int wc =0,vc =0,cc=0,sc=0;
     wc =   s.trim().split("[^\\+.A-Za-z0-9_]+").length;
        String str = s.trim().replaceAll("[^\\.A-Za-z0-9_]", "");
            if(str.length()==0)
                wc =0;
            String si = str.toLowerCase();

            for (int j = 0; j <si.length() ; j++) {
                char c = si.charAt(j);
                if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                    vc++;
                }
                else {
                    cc++;
                }



        }

        System.out.println(wc + " " + vc + " " + cc);
    }
}
