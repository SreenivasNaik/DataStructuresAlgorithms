/*
package com.sreenu.DataStructures;
class Node{
    int data;
    com.sreenu.DataStructures.Node next;
    public Node(int data) {
        this.data = data;
        next = null;
    }
}
class LinkedList {
    Node head = null;
    public void insert(int data){
       Node node = new Node(data);
            if(head==null) {
                head = node;
            }
            else{
             Node temp = head;
             while (temp.next!=null){
                 temp = temp.next;
             }
             temp.next = node;
            }
        }

    public void insertAtStart(int data){
        Node node = new Node(data);
        node.next = head;
        head = node;

    }
    public void insertAt(int data,int pos){
        Node node = new Node(data);
        Node temp =head;
        if(pos == 0){
            insertAtStart(data);
        }
        else{
            for(int i=0;i<pos-1;i++){
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;
        }
          }
          public void deleteAt(int pos){
            if(pos == 0){
                head = head.next;
            }
            else{
                Node node = head;
                for(int i = 0;i<pos-1;i++){
                    node = node.next;
                }
                Node temp = node.next;
                node.next = temp.next;
                System.out.println("deleted Element"+temp.data);
            }
          }

    public void show(){
        Node node = head;
        while (node.next!=null){
            System.out.print(node.data+"\t");
            node = node.next;
        }
        System.out.print(node.data+"\n");

    }


    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(2);
        linkedList.insert(4);
        linkedList.insert(3);
        linkedList.show();
        linkedList.insertAtStart(9);
        linkedList.show();
        linkedList.insertAt(10,0);
        linkedList.show();
        linkedList.deleteAt(3);
        linkedList.show();
    }

    }



*/
