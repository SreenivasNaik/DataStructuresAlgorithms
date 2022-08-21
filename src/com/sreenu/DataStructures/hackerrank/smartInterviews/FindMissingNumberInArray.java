package com.sreenu.DataStructures.hackerrank.smartInterviews;

/**
 * Created by SreenUNaik on 20-Mar-21.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class FindMissingNumberInArray {
    public static void main(String[] args) {
        int a[] = {1,3,4,5};
        boolean c[] = new boolean[6];
        for (int i = 0; i < a.length; i++) {
            c[a[i]] = true;
        }
        for (int i = 1; i < c.length; i++) {
            if(c[i] == false){
                System.out.println("Missing Number"+i);
                break;
            }
        }
    }
}
