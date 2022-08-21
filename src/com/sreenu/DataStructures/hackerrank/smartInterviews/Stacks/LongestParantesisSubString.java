package com.sreenu.DataStructures.hackerrank.smartInterviews.Stacks;

import java.util.Stack;

public class LongestParantesisSubString {
    public static void main(String[] args) {
        String s = "(()()";
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int result =0;
        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i)=='('){
                stack.push(i);
            }else{
                if(!stack.isEmpty()){
                    stack.pop();
                }
                if(!stack.isEmpty()){
                    result = Math.max(result,i-stack.peek());
                }else {
                    stack.push(i);
                }

            }
        }
        System.out.println(stack);
        System.out.println("Length:"+result);
    }
}
