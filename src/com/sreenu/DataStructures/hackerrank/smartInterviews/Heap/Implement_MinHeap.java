package com.sreenu.DataStructures.hackerrank.smartInterviews.Heap;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

/**
 * Created by SreenUNaik on 13-Oct-20.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class Implement_MinHeap {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberOfOperations = Integer.parseInt(br.readLine());
        MinHeap heap = new MinHeap();
        for (int i = 0; i <numberOfOperations ; i++) {
            String s[] = br.readLine().split(" ");
            for (int j = 0; j < s.length; j++) {
                heap.insert(Integer.parseInt(s[j]));
            }
            heap.printHeap();
        }
    }
    static class MinHeap{
        Vector<Integer> values;
        int index;
        MinHeap(){
            values= new Vector<>();
            index =-1;
        }
        void printHeap(){
            System.out.println(Arrays.toString(values.toArray()));
        }

        void insert(int x){
            values.add(x);
            index++;
            int parentIndex = (index-1)/2;
            int currentIndex = index;
            while (parentIndex>=0 && values.get(parentIndex)>x){
                int temp = values.get(parentIndex);
                values.removeElementAt(parentIndex);
                values.add(parentIndex,x);
                values.removeElementAt(currentIndex);
                values.add(currentIndex,temp);
                currentIndex = parentIndex;
                parentIndex = (parentIndex-1)/2;

            }
            //1
            //8 15 6 25 -3 4 17 9 -1
            //[-3, -1, 4, 6, 15, 8, 17, 25, 9]
        }
        void getMin(){
            if(!values.isEmpty())
                System.out.println(values.get(0));
            else
                System.out.println("Empty");
        }
        void deleteMin(){
            values.removeElementAt(0);
            values.add(0,values.get(index--));
            values.removeElementAt(index);
            int parent =0;
            int leftIndex =(parent*2)+1;
            int rightIndex =(parent*2)+2;
            int lrftCHild = Integer.MAX_VALUE;
            int rightCHild = Integer.MAX_VALUE;
            if(leftIndex<=index) {
                 lrftCHild = values.get(leftIndex);
            }
            if (rightIndex<=index){
                rightCHild = values.get(rightIndex);
            }
            int val = Math.min(lrftCHild,rightCHild);

        }
    }
}

