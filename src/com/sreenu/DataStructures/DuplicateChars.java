package com.sreenu.DataStructures;

import java.util.HashSet;

/**
 * Created by SreenUNaik on 25-Apr-20.
 */
public class DuplicateChars {
    public static void isDuplicateCharPresent(String input){
        HashSet<Character> uniq = new HashSet<Character>();
        for(int i=0;i<input.length();i++){
            uniq.add(input.charAt(i));
        }
        if(uniq.size() == input.length()){
            System.out.println("No Duplicate chars");
        }else{
            System.out.println("Duplicate chars present");
        }
    }

    public static void main(String[] args) {
        String s = "sreenivas";
        isDuplicateCharPresent(s);
    }
}
