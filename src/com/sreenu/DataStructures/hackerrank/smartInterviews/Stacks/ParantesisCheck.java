package com.sreenu.DataStructures.hackerrank.smartInterviews.Stacks;

import java.util.Stack;

/**
 * Created by SreenUNaik on 18-Mar-21.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class ParantesisCheck {
    public static void main(String[] args) {
        String s = "{[]{(){}}(){}}";

        System.out.println(isValidParanthesis(s));
    }
    public static  boolean isValidParanthesis(String s){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {

           char x = (s.charAt(i));
            if(x=='(' ||x=='{'|| x=='['  ) {
                stack.push(x);
                continue;
            }
            if (stack.isEmpty())
                return false;
            char check = stack.pop();
            switch (x){
                case ')':
                    if(check == '{' || check == '['){
                        return false;
                    }
                    break;
                case '}':
                    if(check == '(' || check == '['){
                        return false;
                    }
                    break;
                case ']':
                    if(check == '(' || check == '}'){
                        return false;
                    }
                    break;

            }


        }
        return (stack.isEmpty());
    }
}
