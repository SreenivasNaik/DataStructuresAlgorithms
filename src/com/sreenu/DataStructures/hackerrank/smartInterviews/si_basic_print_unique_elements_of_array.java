package com.sreenu.DataStructures.hackerrank.smartInterviews;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by SreenUNaik on 18-Mar-20.
 */
public class si_basic_print_unique_elements_of_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       long [] ar = new long[n];
       for(int i=0;i<n;i++){
           ar[i] = sc.nextLong();
       }
       ArrayList<Long> dup  = new ArrayList<>();
        ArrayList<Long> uniq = new ArrayList<>();
       for(int i=0;i<n;i++){
           int count =0;
           for(int j=i;j<n;j++){
               if(ar[i]==ar[j]){
                   count++;
               }
           }
           if(count==1){
               if(!isPresent(dup,ar[i])){
                   uniq.add(ar[i]);
               }
           }
           else{
               dup.add(ar[i]);
           }

       }
      printResult(uniq);
    }
    static void printResult(ArrayList<Long> dup){
        for(int i=0;i<dup.size();i++){
            if(i==(dup.size()-1)){
                System.out.println(dup.get(i));
            }else{
                System.out.print(dup.get(i)+" ");
            }
        }
    }
    static boolean isPresent(ArrayList<Long> dup, long num){
       if(dup.indexOf(num)>=0)
           return true;
       else
           return  false;

    }
}
