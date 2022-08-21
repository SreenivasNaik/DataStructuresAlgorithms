package com.sreenu.DataStructures.codeForce;


import java.util.Scanner;

/**
 * Created by SreenUNaik on 09-Mar-20.
 */
public class Way_Too_Long_Words {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){

            String pr = sc.nextLine();

            if(pr.length()>10){
                String first = String.valueOf(pr.charAt(0));
                String last = String.valueOf(pr.charAt(pr.length()-1));
                System.out.println(first+(pr.length()-2)+last);
            }else{
                System.out.println(pr);
            }
        }

    }
}
