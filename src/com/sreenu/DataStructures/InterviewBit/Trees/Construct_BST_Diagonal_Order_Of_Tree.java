package com.sreenu.DataStructures.InterviewBit.Trees;

import java.io.*;
import java.util.*;

/**
 * Created by SreenUNaik on 05-Oct-20.
 * Problem :https://www.hackerrank.com/contests/smart-interviews/challenges/si-vertical-order-of-tree/problem
 * Time Complexity :
 * Space Complexity :
 */
public class Construct_BST_Diagonal_Order_Of_Tree {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static  int minv = 0;
    static final Map<Integer, ArrayList<Integer>> map = new TreeMap<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine());
        for (int i = 0; i < tc; i++) {
            int N = Integer.parseInt(br.readLine());
            String a[] = br.readLine().split(" ");
            Node root = null;
            for (int j = 0; j <a.length ; j++) {
                root = insertNode(root,Integer.parseInt(a[j]));
            }
          bw.write(printVerticalOrder(root).toString());

            }
        bw.flush();




    }
    static  public ArrayList<Integer> printVerticalOrder(Node A) throws IOException {

            ArrayList<Integer> res = new ArrayList<>();
            Queue<Node> q = new LinkedList<>();
            q.add(A);
            while(!q.isEmpty()){
                Node curr = q.poll();
                while(curr!=null){
                    res.add(curr.data);
                    if(curr.left!=null) q.add(curr.left);
                    curr = curr.right;
                }
            }
            return res;

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
    static class QNode{
        int level;
        Node root;

        public QNode(int level, Node root) {
            this.level = level;
            this.root = root;
        }
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
