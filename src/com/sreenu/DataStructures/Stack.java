package com.sreenu.DataStructures;

/**
 * Created by SreenUNaik on 17-Sep-18.
 */
public class Stack {
    int stack[] = new int[5];
    int top = 0;
    public void push(int data){
        if(top == 5){
            System.out.println("Stack Full");
        }
        else{
            stack[top] = data;
            top++;
        }

    }
    public void show(){
        for(int i=0;i<stack.length;i++){
            System.out.print(stack[i]+"\t");
        }
        System.out.println();
    }
    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty ");
        } else {
            int data;
            --top;
            data = stack[top];
            stack[top] = 0;
        }
    }
    public int peek(){
        return stack[top-1];
    }
    public int size(){
        return top;
    }
    public boolean isEmpty(){
       return  (top <= 0) ? true : false;

    }
    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println("IsEmpty :"+stack.isEmpty());
        stack.push(10);
        stack.show();
        stack.push(3);
        stack.show();
        stack.push(5);
        stack.show();
        //stack.pop();
       // stack.show();
        stack.push(55);
        stack.show();
        //System.out.println(stack.peek());
        stack.push(53);
        stack.show();
        stack.push(33);
        //System.out.println("size"+stack.size());
        //System.out.println("IsEmpty :"+stack.isEmpty());
        stack.show();
    }
}
