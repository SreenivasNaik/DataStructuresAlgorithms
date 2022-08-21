package com.sreenu.DataStructures.hackerrank.smartInterviews.LinkedList;

/**
 * Created by SreenUNaik on 17-Mar-21.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
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
    public static void printLinkedList(Node h){
        while (h!=null){
            System.out.print(h.data+":");
            h = h.next;
        }
        System.out.println();
    }
}
