package com.sreenu.DataStructures.hackerrank.smartInterviews.Trees;

import java.io.*;

/**
 * Created by SreenUNaik on 12-Oct-20.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class Given_Array_Check_Is_BST {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int pos =0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        for (int i = 0; i <tc ; i++) {
            int n = Integer.parseInt(br.readLine());
            String[] data = br.readLine().split(" ");
            Node root = null;
            for (int j = 0; j <data.length ; j++) {
                root = insertNode(root,Integer.parseInt(data[j]));
            }
            String s = checkISBSTWithROOT(root,Integer.MIN_VALUE,Integer.MAX_VALUE)?"True":"False";
            bw.write(s+"\n");

        }
        bw.flush();
    }

    private static boolean checkISBSTWithROOT(Node root, int minValue, int maxValue) {
        if (root == null) return true;
        return (root.data>minValue && root.data<maxValue
            && checkISBSTWithROOT(root.left,minValue,root.data)
                && checkISBSTWithROOT(root.right,root.data,maxValue)
        );
    }

    private static void checkIsBST(int n, String[] data) throws IOException {
        int min = Integer.MIN_VALUE; int max = Integer.MAX_VALUE;
        int d[] =new int[n];
        for (int i = 0; i <n ; i++) {
            d[i] = Integer.parseInt(data[i]);
        }
        boolean flag = true;
        min = max = d[0];
        for (int i = 0; i <n ; i++) {
            int parent =  d[i];
            int leftChildIndex = (2*i)+1;
            int rightChildIndex = (2*i)+2;
            if (leftChildIndex<=n){
                int leftChild = d[leftChildIndex];
                if (!(leftChild<parent && leftChild<max))
                {
                    flag = false;
                    break;
                }
            }
            if (rightChildIndex<=n){
                int rightChild = d[rightChildIndex];
                if (!(rightChild>parent && rightChild>min))
                {
                    flag = false;
                    break;
                }
            }



        }
        String s = flag?"True":"False";
        bw.write(s+"\n");

    }

    private static Node insertNode(Node root, int i) {
        if(root == null) {
            root = new Node(i);
            return root;
        }
        if(i<root.data)
            root.left = insertNode(root.left,i);
        else
            root.right = insertNode(root.right,i);
        return root;
    }
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }
}
