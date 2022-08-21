package com.sreenu.DataStructures.hackerrank.smartInterviews.Class_3;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by SreenUNaik on 10-Aug-20.
 */
/*
Given a string containing just the characters '(', ')', '{', '}', '[' and ']',
 determine if the input string is valid.
        The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.

        Return 0 / 1 ( 0 for false, 1 for true ) for this problem*/
public class Paratensis_correct_or_Not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextLine());
    }
    public int isValid(String s) {
        int length=s.length();
        char [] array=s.toCharArray();
        if(length==0) return 1;
        Stack<Character> stack=new Stack<Character>();
        for(int i=0; i<length; i++)
        {
            if(array[i]=='(' || array[i]=='{' || array[i]=='[' )
            {
                stack.push(array[i]);
            }
            if(array[i]==')' ||array[i]=='}' ||array[i]==']')
            {
                if(stack.isEmpty()) return 0;
                char temp=stack.pop();
                if((temp=='(' && array[i]==')' ) || (temp=='{' && array[i]=='}' ) ||(temp=='[' && array[i]==']' )  )
                {
                    continue;
                }else
                {
                    return 0;
                }
            }
        }
        if(!stack.isEmpty()) return 0;
        return 1;

    }
}
