package com.sreenu.DataStructures;

/**
 * Created by SreenUNaik on 02-Aug-20.
 */
public class UnsingedInt
{
    public static void main(String[] args) {
        System.out.println(unsingnedLog(1000000));
    }
    public static long unsingnedLog(long l){
        long s=0;

        while (l!=0){
            if(l%2==1){
                s++;
            }
            l=l/2;
        }
        return  s;
    }
}
