package com.sreenu.DataStructures.hackerrank.smartInterviews;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by SreenUNaik on 08-Aug-20.
 */
public class Reverse32BitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.nextLine());
        System.out.println(reverse(n));
    }

        public static long reverse(long a) {
            int times = 32;
            List<Long> l = new ArrayList<Long>();
            while(times>0){
                long t = a&1;
                l.add(t);
                a= a>>1;
                times--;
            }
            long res =0;
            for(int i=0;i<l.size();i++){
                res = res<<1;
                res = res | l.get(i);
            }
            return res;

        }
    }


