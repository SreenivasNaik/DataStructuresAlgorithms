package com.sreenu.DataStructures.hackerrank.smartInterviews.LinkedList;

import java.util.Stack;

/**
 * Created by SreenUNaik on 17-Mar-21.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class GivenLLCheckItsPolindromeOrNot {
    public static void main(String[] args) {
        Node node = new Node(1);
        Node tmp = node;
        node.next = new Node(4);
        node = node.next;
        node.next=new Node(4);
        node = node.next;
        node.next = new Node(2);
        System.out.println(isPolindromByStacks(tmp));
    }

    private static boolean isPolindromByStacks(Node head) {
        Node temp = head;
        boolean isPolindrome = true;
        Stack<Integer> integers = new Stack<>();
        while (temp!=null){
            integers.push(temp.data);
            temp = temp.next;
        }
        while (head!=null){
            if(head.data!= integers.pop()){
                isPolindrome = false;
                break;
            }
            head = head.next;
        }
        return isPolindrome;

    }
}
