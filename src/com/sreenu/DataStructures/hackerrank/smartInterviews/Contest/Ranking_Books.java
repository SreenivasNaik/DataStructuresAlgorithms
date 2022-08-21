package com.sreenu.DataStructures.hackerrank.smartInterviews.Contest;

import java.util.*;

/**
 * Created by SreenUNaik on 30-Aug-20.
 * Problem :
 * Time Complexity : T*(M*N) - 2*10^2 *10^4*10^4 ===> 2*10^10 > 10^9 casuing TLE
 * Space Complexity :
 */
public class Ranking_Books {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int i = 0; i < tc; i++) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int j = 0; j < n; j++) {
                a[j]= sc.nextInt();
            }
            int numOfDays = sc.nextInt();
            int pages[] = new int[numOfDays];
            for (int j = 0; j <numOfDays; j++) {
                pages[j] = sc.nextInt();
            }
            int tem [] = findRankingBooks(a,n,pages,numOfDays);
            for (int j = 0; j <tem.length ; j++) {
                if(j<tem.length-1) {
                    System.out.print(tem[j] + " ");
                }else {
                    System.out.println(tem[j]);
                }

            }

        }
    }

    private static int[] findRankingBooks(int[] a, int n, int[] pages, int numOfDays) {
        int rank[] = new int[numOfDays];
        for (int i = 0; i <numOfDays ; i++) {
            int temp[] = new int[n+1];
            for (int j = 0; j <n+1 ; j++) {
                if(j<n) {
                    temp[j] = a[j];
                }else {
                    temp[j] = pages[i];
                }
            }
         //   Arrays.sort(temp);
            doInsertionSort(temp);
      //      System.out.println(Arrays.toString(temp));
            HashMap<Integer,Integer> set = new HashMap<>();
            int r= 1;

             for (int j = 0; j <temp.length ; j++) {
                 if (!set.containsKey(temp[j])) {
                     set.put(temp[j],r);
                     r++;
                 }

            }
           int curenTRsnk = set.get(pages[i]);
             rank[i]= curenTRsnk;
        }
        return rank;
    }

    private static void doInsertionSort(int[] array) {
        int n = array.length;
        int current = array[array.length-1];
        for (int j =n-2 ; j >=0 ; j--) {
            if (current>array[j]){
               array[j+1] = array[j];
               array[j] = current;
            }
            else {
                break;
            }

        }

    }

}
