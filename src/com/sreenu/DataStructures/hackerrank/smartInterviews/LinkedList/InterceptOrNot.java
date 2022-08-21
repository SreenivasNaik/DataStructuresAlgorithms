package com.sreenu.DataStructures.hackerrank.smartInterviews.LinkedList;

import java.util.HashSet;

/**
 * Created by SreenUNaik on 17-Mar-21.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class InterceptOrNot {
    public static void main(String[] args) {
        Node n1 = new Node(1);
        n1.next = new Node(2);
        n1.next.next = new Node(3);
        n1.next.next.next = new Node(4);
        n1.next.next.next.next = new Node(5);
        n1.next.next.next.next.next = new Node(6);
        n1.next.next.next.next.next.next = new Node(7);
        // list 2
        Node n2 = new Node(10);
        n2.next = new Node(9);
        n2.next.next = new Node(8);
        n2.next.next.next = n1.next.next.next;
        Node.printLinkedList(n1);
        Node.printLinkedList(n2);
        FindInterceptPointByUsingHashSet(n1,n2);
    }

    private static void FindInterceptPointByUsingHashSet(Node n1, Node n2) {
        // Order of N+M; N
        HashSet<Integer> nodeData = new HashSet<>();
        Node tmp = n1;
        while (tmp!=null){
            nodeData.add(tmp.data);
            tmp = tmp.next;
        }
        while (n2!=null){
            if (nodeData.contains(n2.data)){
                System.out.println("Interception found at::"+n2.data);
                return;
            }
            n2 = n2.next;
        }
        System.out.println("No interception");
    }
}


