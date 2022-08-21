package com.sreenu.DataStructures;

/**
 * Created by SreenUNaik on 17-Sep-18.
 */
public class DStack {
    int capacity = 2;
    int stack[] = new int[capacity];
    int top = 0;
    public void push(int data){
        if(size() == capacity){
            expand();
        }
            stack[top] = data;
            top++;
        }

    private void expand() {
        int length = size();
        int newStack[] = new int[capacity*2];
        System.arraycopy(stack,0,newStack,0,length);
        stack = newStack;
        capacity*=2;

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
            shrink();
        }
    }

    private void shrink() {
        int length = size();
        if(length <= (capacity/2)/2){
            capacity = capacity/2;
            int newStack[] = new int[capacity];
            System.arraycopy(stack,0,newStack,0,length);
            stack = newStack;
        }
    }

    public int peek(){
        return stack[top-1];
    }
    public int size(){
        return top;
    }
    public boolean isEmpty(){
        boolean isEmpty;
        isEmpty = (top <= 0) ? true : false;
        return isEmpty;
    }
    public static void main(String[] args) {
        DStack stack = new DStack();
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
