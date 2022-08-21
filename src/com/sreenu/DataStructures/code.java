package com.sreenu.DataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by SreenUNaik on 14-Oct-18.
 */
public class code
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        for(int i=0;i<testcases;i++){
            int N = sc.nextInt();
            int power = sc.nextInt();
            int a[] = new int[N];
            for(int j =0;j<N;j++){
                a[j]  =sc.nextInt();
            }
            checkAndPrint(N,power,a);
        }

    }

    private static void checkAndPrint(int n, int power, int[] a) {
        int counter=0;
        if(power<0)
            System.out.println("No");
        else{

            for(int i =0;i<n;i++){

                if(power>0){
                    if(i==0){
                        power = power - a[i];
                        counter++;
                        System.out.println("T-"+i+"::"+Arrays.toString(a)+"power"+power);
                    }
                    else{
                        if(i%2!=0){
                            for(int j=i;j<n;j++){
                                if(a[j]%2==0) {
                                    if(a[j]!=0)
                                         a[j] = a[j] - 1;
                                }
                            }
                        }
                            else {
                                for(int j=i;j<n;j++){
                                    if(a[j]%2!=0)
                                        if(a[j]!=0)
                                            a[j] = a[j]-1;
                                }


                        }
                        power = power -a[i];
                        counter++;
                    }
                }
                else{
                    System.out.println("No");
                }

            }
        }
        if(counter == n)
            System.out.println("Yes "+power);
    }
}
