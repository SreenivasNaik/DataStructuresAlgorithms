package com.sreenu.DataStructures.hackerrank.smartInterviews.LinkedList;

/**
 * Created by SreenUNaik on 17-Mar-21.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class LinkedList {
    public static void main(String[] args) {
        Node node = createLinkedList(1,5);
        printLinkedList(node);
      //  printReverse(node);
        node = insertAtGivenPosition(node,10,3);
        printLinkedList(node);
        node = deleteAtGivenPosition(node,3);
        printLinkedList(node);
    }
    public static int size(Node h){
        int c=0;
        while (h!=null){
            c++;
            h = h.next;
        }
        return c;
    }
    public static Node deleteAtGivenPosition(Node head,int pos){
        if(pos<0 || pos>size(head)) return head;
        if(pos == 0)
            return head.next;
        Node temp = head;
        while (--pos!=0){
            head = head.next;
        }
        head.next= head.next.next;
        return temp;
    }
    public static Node insertAtGivenPosition(Node head,int x,int pos){
        if (pos<0 || size(head)<pos )
            return head;
        Node n = new Node(x);
        Node th = head;
        if (pos ==0){
            n.next = head;
            return n;
        }
        while (--pos!=0){
            head = head.next;
        }
        n.next = head.next;
        head.next = n;
        return th;
    }
    public  static  void  printReverse(Node h){
        if(h==null){ return;}
        printReverse(h.next);
        System.out.print(h.data+":");
    }
    public static void printLinkedList(Node h){
        while (h!=null){
            System.out.print(h.data+":");
            h = h.next;
        }
        System.out.println();
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
