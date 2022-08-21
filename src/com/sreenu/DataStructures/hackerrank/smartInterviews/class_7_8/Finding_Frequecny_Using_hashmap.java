package com.sreenu.DataStructures.hackerrank.smartInterviews.class_7_8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by SreenUNaik on 23-Aug-20.
 * Problem : https://www.hackerrank.com/contests/smart-interviews/challenges/si-finding-frequency/submissions/code/1325881341
 * Time Complexity : N+Q
 * Space Complexity : N
 */
public class Finding_Frequecny_Using_hashmap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        HashMap<Long,Integer> frequencyMap = new HashMap<>();
        long a[] = new long[N];
        for (int i = 0; i <N ; i++) {
            a[i] = sc.nextLong();
            if(frequencyMap.containsKey(a[i])){
                int val = frequencyMap.get(a[i])+1;
                frequencyMap.put(a[i],val);
            }else{
                frequencyMap.put(a[i],1);
            }
        }
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            long x = sc.nextLong();
            if(frequencyMap.containsKey(x)){
                System.out.println(frequencyMap.get(x));
            }else {
                System.out.println(0);
            }

        }
    }

}
