package com.sreenu.DataStructures.InterviewBit.Trees;

import java.io.*;
import java.util.*;

/**
 * Created by SreenUNaik on 05-Oct-20.
 * Problem :https://www.hackerrank.com/contests/smart-interviews/challenges/si-vertical-order-of-tree/problem
 * Time Complexity :
 * Space Complexity :
 */
public class Construct_BST_Vertical_Order_Of_Tree {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static  int minv = 0;
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
           printVerticalOrder(root);

            }
        bw.flush();




    }
    static void printVerticalOrder(Node root) throws IOException {
        // Base case
        if (root == null)
            return;

        TreeMap<Integer, TreeSet<Integer> > m = new TreeMap<>();
        int hd = 0;

        Queue<QNode> que = new LinkedList<QNode>();
        que.add(new QNode(0, root));

        while (!que.isEmpty()) {
            // pop from queue front
            QNode temp = que.poll();
            hd = temp.level;
            Node node = temp.root;


            if (m.containsKey(hd)) {
                m.get(hd).add(node.data);
            }
            else {
                TreeSet<Integer> al = new TreeSet<>();
                al.add(node.data);
                m.put(hd, al);
            }
            if (node.left != null)
                que.add(new QNode(hd - 1, node.left));
            if (node.right != null)
                que.add(new QNode(hd + 1, node.right));
        }

        for (Map.Entry<Integer, TreeSet<Integer> > entry : m.entrySet()) {
            TreeSet<Integer> al = entry.getValue();
            for (Integer i : al)
                bw.write(i + " ");
            bw.write("\n");

        }
        bw.write("\n");
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
