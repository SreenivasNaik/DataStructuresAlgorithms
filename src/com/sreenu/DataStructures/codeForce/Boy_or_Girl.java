package com.sreenu.DataStructures.codeForce;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by SreenUNaik on 09-Mar-20.
 */
public class Boy_or_Girl {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s1 = sc.nextLine();
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<s1.length();i++){
            set.add(s1.charAt(i));
        }
        if(set.size()%2==0){
            System.out.println("CHAT WITH HER!");
        }else{
            System.out.println("IGNORE HIM!");
        }
    }

}
