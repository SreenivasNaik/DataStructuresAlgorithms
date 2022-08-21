package com.sreenu.DataStructures.hackerrank.smartInterviews.Stacks;

public class ImplementStackUsingLinkedLists {
    StackNode root;

    public static void main(String[] args) {
        ImplementStackUsingLinkedLists implementStackUsingLinkedLists = new ImplementStackUsingLinkedLists();
        implementStackUsingLinkedLists.push(10);
        implementStackUsingLinkedLists.push(30);
        implementStackUsingLinkedLists.push(40);
        implementStackUsingLinkedLists.push(20);
        implementStackUsingLinkedLists.printStack();
        implementStackUsingLinkedLists.pop();
        implementStackUsingLinkedLists.printStack();
    }
    public boolean isEmpty(){
        if(root == null)
            return false;
        else
            return true;
    }
    public void push(int data){
        StackNode node = new StackNode(data);
        if(root == null)
        {
            root =node;
        }else {
            StackNode temp = root;
            root = node;
            node.next = temp;
        }
        System.out.println(data+"pushed to stack");
    }
    public int pop(){
        int poped = Integer.MIN_VALUE;
        if (root == null)
        {
            System.out.println("Stack underflow");
        }else {
            poped = root.data;
            root = root.next;
        }
        System.out.println("Value from top:"+poped);
        return poped;
    }
    public void printStack(){
        StackNode tmp = root;
        while (tmp!=null){
            System.out.print(tmp.data+"::");
            tmp = tmp.next;
        }
        System.out.println();
    }
    static class StackNode{
        public int data;
        StackNode next;

        public StackNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
