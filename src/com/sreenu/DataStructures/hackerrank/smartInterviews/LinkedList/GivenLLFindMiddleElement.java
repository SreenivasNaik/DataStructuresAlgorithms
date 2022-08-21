package com.sreenu.DataStructures.hackerrank.smartInterviews.LinkedList;

/**
 * Created by SreenUNaik on 17-Mar-21.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class GivenLLFindMiddleElement {
    public static void main(String[] args) {
        LinkedList.Node node = LinkedList.createLinkedList(1,10);
        LinkedList.Node middleNode = FindMiddleNode(node,true);
        System.out.println("MiddleNode::"+middleNode.data);
    }

    private static LinkedList.Node FindMiddleNode(LinkedList.Node head, boolean b) {
        LinkedList.Node slow = head,fast = head;
        while (fast.next!=null && fast.next.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast.next==null || b== true)
            return slow;
        else
            return slow.next;
    }
}
