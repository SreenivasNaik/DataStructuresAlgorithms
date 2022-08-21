package com.sreenu.DataStructures.hackerrank.smartInterviews.LinkedList;

/**
 * Created by SreenUNaik on 17-Mar-21.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class GivenTwoSortedLLMergeBoth {
    public static void main(String[] args) {
        Node LL1 = createLinkedList(1,5);
        Node LL2 = createLinkedList(6,10);
        Node mergedLL = MergeTwoSortedLinkedLists(LL1,LL2);
        printLinkedList(mergedLL);
        System.out.println();
    }
    public static void printLinkedList(Node h){
        while (h!=null){
            System.out.print(h.data+":");
            h = h.next;
        }
        System.out.println();
    }
    public static Node MergeTwoSortedLinkedLists(Node h1,Node h2){
        Node temp = new Node(0); Node td = temp;
        while (h1!=null && h2!=null){
            if(h1.data<h2.data){
                temp.next = h1;
                h1 = h1.next;
            }else{
                temp.next = h2;
                h2 = h2.next;
            }
             temp = temp.next;
        }
        if(h1!=null){
            temp.next = h1;
        }
        if(h2!=null)
            temp.next = h2;

        return td.next;

    }
    public static Node createLinkedList(int start,int N){
        Node head = new Node(start);
        Node temp = head;
        for (int i = start+1; i <=N ; i++) {
            head.next = new Node(i);
            head = head.next;
        }
        return temp;
    }
    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
