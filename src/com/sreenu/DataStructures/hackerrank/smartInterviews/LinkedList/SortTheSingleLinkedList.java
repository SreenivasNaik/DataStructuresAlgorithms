package com.sreenu.DataStructures.hackerrank.smartInterviews.LinkedList;

/**
 * Created by SreenUNaik on 17-Mar-21.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class SortTheSingleLinkedList {
    public static void main(String[] args) {
        Node node = new Node(1);
        Node tmp = node;
        node.next = new Node(4);
        node = node.next;
        node.next=new Node(3);
        node = node.next;
        node.next = new Node(9);

        Node.printLinkedList(MergeSort(tmp));
    }
    public static Node MergeSort(Node head){
        if(head == null || head.next == null) return head;
        Node mid = findMid(head);
        Node secondHead = mid.next;
        mid.next = null;
        Node sorted = mergeBothHeads(MergeSort(head),MergeSort(secondHead));
        return sorted;
    }

    private static Node mergeBothHeads(Node h1, Node h2) {
       Node result = null;
       if (h1 ==null)
           return h2;
       if (h2 == null)
           return h1;
       if (h1.data<=h2.data){
           result = h1;
           result.next = mergeBothHeads(h1.next,h2);
       }else {
           result =h2;
           result.next = mergeBothHeads(h1,h2.next);
       }
       return result;
    }

    private static Node findMid(Node head) {
        Node fast = head,slow = head;
        while (fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
