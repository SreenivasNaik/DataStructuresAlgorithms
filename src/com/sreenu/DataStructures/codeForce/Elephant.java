package com.sreenu.DataStructures.codeForce;

import java.util.Scanner;

/**
 * Created by SreenUNaik on 09-Mar-20.
 */
public class Elephant {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int s1 = sc.nextInt();
        if(s1%5==0){
            System.out.println(s1/5);
        }else{
            System.out.println((s1/5)+1);
        }
    }
}
