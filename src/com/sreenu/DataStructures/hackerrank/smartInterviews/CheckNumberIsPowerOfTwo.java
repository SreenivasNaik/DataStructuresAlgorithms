package com.sreenu.DataStructures.hackerrank.smartInterviews;

/**
 * Created by SreenUNaik on 05-Aug-20.
 */
public class CheckNumberIsPowerOfTwo {
    static boolean isPowerOfTwo(long n)
    {
       /* ### Appoach -1
       if(n==0)
            return false;
        long a = (long)(Math.ceil((Math.log(n) / Math.log(2))));
        System.out.println(a);
        long b = (long)(Math.floor(((Math.log(n) / Math.log(2)))));
        System.out.println(b);
        return a==b;*/
        // ## Appoach -2
        return n!=0 && ((n&(n-1))==0) ;
    }

    // Driver Code
    public static void main(String[] args)
    {
        if(isPowerOfTwo((long)1000000000))
            System.out.println("Yes");
        else
            System.out.println("No");

        if(isPowerOfTwo(64))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
