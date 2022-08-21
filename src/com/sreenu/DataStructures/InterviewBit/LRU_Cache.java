package com.sreenu.DataStructures.InterviewBit;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created By Sreenivasnaik.Mudava on 10/1/2018
 */
public class LRU_Cache {
    HashMap<Integer,Node> map;
    DoubleLinkedList cache;
    int capacity;
    int pageFaults;

    public LRU_Cache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>(capacity);
        cache = new DoubleLinkedList(capacity);
        pageFaults = 0;
    }
    public void set(int key,int value){
        if(map.containsKey(key)){
            cache.moveThisNodeToFront(map.get(key));
        }
        else{
            pageFaults++;
            if(cache.getCurrentSize() == capacity){
                map.remove(cache.getTail().getValue());
            }
            Node node = new Node(value);
            cache.addNode(node);
            map.put(key,node);
        }

    }
    public int get(int key){
        if(map.containsKey(key)){
            return map.get(key).getValue();
        }else{
            return -1;
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
        LRU_Cache lru_cache = new LRU_Cache(size);
        for(int i = 0;i<length;i++){
            lru_cache.set(i,a[i]);
        }
        System.out.println(lru_cache.pageFaults);
        lru_cache.cache.printCache();
    }
}

class DoubleLinkedList{
    Node head =null;
    Node tail = null;
    int currentSize = 0;
    private final int size;

    public DoubleLinkedList(int size) {
        this.size = size;
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

    public int getSize() {
        return size;
    }


    public Node addNode(Node node) {
        if(head == null){
            head = node;
            tail = node;
            currentSize++;
            return node;
        }
        else if(currentSize < size){
            node.next = head;
            head.prev = node;
            // tail.prev = node;
            head = node;
            currentSize++;
            return node;
        }
        else{
            node.next = head;
            head.prev = node;
            // tail.prev = node;
            head = node;
            tail = tail.getPrev();
            tail.setNext(null);
            return node;

        }
    }
    public void printCache(){
        if(head != null){
            Node temp = head;
            while(temp !=null){
                System.out.print(temp.value+" ");
                temp = temp.getNext();
            }
        }
    }
    public Node moveThisNodeToFront(Node node) {
        if(node == head){
            return node;
        }else{
            if(node.prev != null && node.next !=null) {
                node.getPrev().setNext(node.next);
                node.getNext().setPrev(node.getPrev());
                node.next = head;

                head.prev = node;
                head = node;
                return node;
            }
            else if(node.next == null){
                node.next = head;
                tail = node.prev;
                tail.next = null;
                head.prev = node;
                head = node;
                return node;
            }
            else{
                return node;
            }

        }

    }
}

class  Node {
    int value;
    Node next;
    Node prev;

    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
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
