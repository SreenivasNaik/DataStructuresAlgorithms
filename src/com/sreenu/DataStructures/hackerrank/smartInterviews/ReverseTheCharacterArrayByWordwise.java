package com.sreenu.DataStructures.hackerrank.smartInterviews;

import java.util.Arrays;

/**
 * Created by SreenUNaik on 20-Mar-21.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class ReverseTheCharacterArrayByWordwise {
    public static void main(String[] args) {
        char arr[] = {'w','e',' ','a','r','e',' ','c','i','s','c','o'};

        doInplaceReverseWords(arr);
    }

    private static void doInplaceReverseWords(char[] arr) {
        char revArr[] = new char[arr.length];
        int j=0;
        for (int i = arr.length-1; i >=0 ; i--) {
            revArr[j]= arr[i];
            j++;
        }
        int p1=0,p2=0;
        for (int i = 0; i <revArr.length ; i++) {
            char c = revArr[i];
            if(c==' '){
                p2 = i-1;
                while(p1!=p2){
                    char tmp = revArr[p1];
                    revArr[p1] = revArr[p2];
                    revArr[p2] = tmp;
                    p1++;
                    p2--;
                }
                p1 = i+1;
            }
            if(i==revArr.length-1){
                p2=revArr.length-1;
                int tmp1 = p2,tmp2= p1;
                while(p1!=p2 && p1<tmp1 && p2>tmp2){
                    char tmp = revArr[p1];
                    revArr[p1] = revArr[p2];
                    revArr[p2] = tmp;
                    p1++;
                    p2--;
                }
            }
        }
        System.out.println("Reveresd Array:"+ Arrays.toString(revArr));
    }
}
