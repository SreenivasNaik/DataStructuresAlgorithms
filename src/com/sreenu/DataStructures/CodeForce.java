package com.sreenu.DataStructures;

import java.util.Scanner;


public class CodeForce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k =sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();
        int ammount = 0;
        for(int i=1;i<=w;i++){
            ammount+= k*i;
        }

        if(ammount <= n) {
            System.out.println(0);
        }
        else{
            System.out.println(Math.abs(ammount-n));
        }

    }
}
