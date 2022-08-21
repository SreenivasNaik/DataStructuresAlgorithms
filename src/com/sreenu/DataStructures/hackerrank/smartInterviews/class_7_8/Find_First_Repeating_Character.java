package com.sreenu.DataStructures.hackerrank.smartInterviews.class_7_8;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by SreenUNaik on 23-Aug-20.
 * Problem : https://www.hackerrank.com/contests/smart-interviews/challenges/si-find-first-repeating-character/submissions/code/1325890939
 * Time Complexity : L(length Of String)+L
 * Space Complexity : L
 */
public class Find_First_Repeating_Character {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        for(int i=0;i<n;i++){
            String s=scn.next();
            HashMap<Character,Integer> hs=new HashMap<Character,Integer>();
            int check=0;
            //  System.out.println(s);
            for(int j=0;j<s.length();j++){
                char k=s.charAt(j);
                if(hs.containsKey(k)){
                    hs.put(k,hs.get(k)+1);
                    //System.out.println("Added: IN IF: "+k);

                }
                else{
                    hs.put(s.charAt(j),1);
                    // System.out.println("Added: IN IF: "+s.charAt(j));
                }
            }

            for (int j=0;j<s.length();j++)  {
                // System.out.println("Key = " + entry.getKey() +
                //              ", Value = " + entry.getValue());
                if(hs.get(s.charAt(j))>1){
                    System.out.println(s.charAt(j));
                    check=1;
                    break;
                }

            }
            if(check==0){
                System.out.println('.');
            }

        }


    }
}