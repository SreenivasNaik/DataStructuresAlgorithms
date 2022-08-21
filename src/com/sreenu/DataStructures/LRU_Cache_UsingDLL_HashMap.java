package com.sreenu.DataStructures;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by SreenUNaik on 18-Mar-21.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class LRU_Cache_UsingDLL_HashMap {
    HashMap<Integer,Node> map;
    DoubleLinkedList cache;
    int capacity;
    int pagefaults;

    public LRU_Cache_UsingDLL_HashMap( int capacity) {
        this.map = new HashMap<>(capacity);
        this.cache = new DoubleLinkedList(capacity);
        this.capacity = capacity;
        this.pagefaults = 0;
    }
    public void addPage(int data){
        if(map.containsKey(data)){
            cache.MoveNodeToFront(map.get(data));
        }else{
            pagefaults++;
            if(cache.getCurrentSize() == capacity){
                map.remove(cache.getTail().getData());
            }
            Node node = new Node(data);
            cache.addNode(node);
            map.put(node.getData(),node);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int size = scanner.nextInt();
        int a[] = new int[length];
        for(int i=0;i<length;i++){
            a[i] = scanner.nextInt();
        }
        LRU_Cache_UsingDLL_HashMap lru_cache = new LRU_Cache_UsingDLL_HashMap(size);
        for(int i = 0;i<length;i++){
            lru_cache.addPage(a[i]);
        }
        System.out.println(lru_cache.pagefaults);
        lru_cache.cache.printCache();

    }
    static class DoubleLinkedList{
        Node head = null, tail = null;
        int currentSize;
        private final int framesize ;

        public DoubleLinkedList(int framesize) {
            this.framesize = framesize;
        }

        public Node getHead() {
            return head;
        }

        public void setHead(Node head) {
            this.head = head;
        }

        public Node getTail() {
            return tail;
        }

        public void setTail(Node tail) {
            this.tail = tail;
        }

        public int getCurrentSize() {
            return currentSize;
        }

        public void setCurrentSize(int currentSize) {
            this.currentSize = currentSize;
        }

        public int getFramesize() {
            return framesize;
        }

        public Node addNode(Node node) {
            if(head == null){
                head = node;
                tail = node;
                currentSize++;
                return node;
            }else if(currentSize<framesize){
                node.next = head;
                head.prev = node;
                head = node;
                currentSize++;
                return node;
            }else{
                node.next = head;
                head.prev = node;
                head = node;
                tail = tail.prev;
                tail.next = null;
                return node;
            }
        }

        public Node MoveNodeToFront(Node node) {
            if(node == head){
                return node;
            }else {
                // case:1 Node is in Middle - moving that to first place
                if(node.getNext()!=null && node.getPrev()!=null) {
                    node.getPrev().setNext(node.getNext());
                    node.getNext().setPrev(node.getPrev());
                    node.next = head;
                    head.prev = node;
                    head = node;
                    return node;
                } // case :2 Node is at end
                else if(node.getNext() ==null){
                    node.next = head;
                    tail = node.prev;
                    tail.next = null;
                    head.prev = node;
                    head = node;
                    return node;
                } // Case :3 Node is At start
                else {
                    return node;
                }
            }
        }

        public void printCache() {
            if(head !=null){
                Node tmp = head;
                while (tmp!=null){
                    System.out.print(tmp.data+":");
                    tmp = tmp.getNext();
                }
                System.out.println();
            }
        }
    }

    static class Node{
        int data;
        Node next,prev;

        public Node(int data) {
            this.data = data;
            this.next = prev = null;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node getPrev() {
            return prev;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }
    }
}
