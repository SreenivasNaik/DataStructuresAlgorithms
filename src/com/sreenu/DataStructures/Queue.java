package com.sreenu.DataStructures;

/**
 * Created by SreenUNaik on 17-Sep-18.
 */
public class Queue {
    int queue[] = new int[5];
    int rear = 0;
    int size = 0;
    int front = 0;

    public void enqueue(int data){
        if(!isFull()) {
            queue[rear] = data;
            rear = (rear + 1) % 5;
            size++;
        }
        else{
            System.out.println("Queue Full");
        }
    }
    public void show(){
        for(int i=0;i<size;i++){
            System.out.print(queue[(front+i)%5]+"\t");
        }
        System.out.println();
    }
    public int dequeue(){
        if (!isEmpty()) {
            int data = queue[front];
            front = (front + 1) % 5;
            size--;
            return data;
        }
        else{
            System.out.println("queue is empty");
            return -1;
        }

    }
    public int getSize(){
        return size;
    }
    public boolean isEmpty(){
      return size == 0;
    }
    public boolean isFull(){
        return size == 5;
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(16);
        queue.enqueue(36);
        queue.show();
        System.out.println(queue.dequeue());
        queue.show();
        System.out.println(queue.dequeue());
        queue.show();
        queue.enqueue(5);
        queue.enqueue(6);
        queue.show();
    }
}
