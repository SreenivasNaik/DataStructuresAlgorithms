package com.sreenu.DataStructures.hackerrank.smartInterviews.Stacks;

public class ImplementStackUsingArray {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }

static class Stack{
    static final int max = 100;
    int top ;
    int stack[] = new int[max];
    Stack(){
        top = -1;
    }
    boolean isEmpty(){
        return top<0;
    }
    boolean push(int x){
        if(top>=max-1){
            System.out.println("Stack Overflow");
            return false;
        }else {
            stack[++top] = x;
            System.out.println(x+"pushed to stack");
            return true;
        }
    }
    int pop(){
        if(top<0){
            System.out.println("Stack Underflow");
            return 0;
        }else {
            int x = stack[top--];
            System.out.println(x+"poped from stack");
            return x;
        }
    }
    int peek(){
        if(top<0){
            System.out.println("Stack Underflow");
            return 0;
        }else {
            int x = stack[top];
            System.out.println(x+"peeked from stack");
            return x;
        }
    }
}
}
