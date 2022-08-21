package com.sreenu.DataStructures.hackerrank.smartInterviews.LinkedList;

import java.util.HashSet;

/**
 * Created by SreenUNaik on 17-Mar-21.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class FindCycleInLinkedList {
    public static void main(String[] args) {
        Node node = new Node(1);
        Node tmp = node;
        node.next = new Node(4);
        node = node.next;
        Node tmp1 = node;
        node.next=new Node(5);
        node = node.next;
        node.next = new Node(2);
        node = node.next;
        node.next = tmp1;


        // Creating a loop for testing
         //detectLoopAndRemoveLoop(tmp);
            detectLoopAndRemoveLoopUsingHashSet(tmp);

        Node.printLinkedList(tmp);
    }
    private static void detectLoopAndRemoveLoopUsingHashSet(Node head){
        HashSet<Node> nodes = new HashSet<>();
        Node tmp = head; Node prev = head ;
        while (head!=null){
            if(!nodes.add(head)){
                System.out.println("Loop detected at:"+head.data);
                prev.next = null;
                break;
            }{
                prev = head;
            }
            head = head.next;

        }
    }

    private static void detectLoopAndRemoveLoop(Node head) {
        Node slow = head,fast = head;
        while (slow!=null && fast!=null && fast.next !=null){
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast){
                System.out.println("Loop Detected");
                removeLoop(slow,head);
            }
        }
    }

    private static void removeLoop(Node slow,Node head) {
        Node ptr1 = null,ptr2 =null ;
        ptr1 = head;
        while (true){
            ptr2 = slow;
            while (ptr2.next!=slow && ptr2.next != ptr1){
                ptr2 =ptr2.next;
            }
            if (ptr2.next == ptr1){
                break;
            }
            ptr1 = ptr1.next;
        }
        ptr2.next = null;
    }
}
