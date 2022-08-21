package com.sreenu.DataStructures.hackerrank.smartInterviews;

import java.util.Scanner;


public class setBits {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long number = Long.parseLong(sc.nextLine());
        System.out.println(countSetbits(number));

    }
    static long countSetbits(long N){
   /*
    It will give TLE
    long count =0;
        for(long i=1;i<=n;i++){
            long num =i;
            while(num!=0){
                count++;
                num&=(num-1);
            }
        }*/
   // Optimal soultion
        //https://www.geeksforgeeks.org/count-total-set-bits-in-all-numbers-from-1-to-n/

            int two = 2;
            long ans = 0;
            long n = N;
            while(n!=0){
                ans += (N/two)*(two>>1);
                if((N&(two-1)) > (two>>1)-1) ans += (N&(two-1)) - (two>>1)+1;
                two <<= 1;
                n >>= 1;
            }

            double m = 1e9+7;
            ans =  (long)( ans%m);
            return ans;

    }
}
