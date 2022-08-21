package com.sreenu.DataStructures.hackerrank.smartInterviews.Trees;

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
    static final Map<Integer, ArrayList<Integer>> map = new TreeMap<>();
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
             final Map<Integer, ArrayList<Integer>> map = new TreeMap<>();
           bw.write(printVerticalOrder(root).toString());

            }
        bw.flush();




    }
    static  public ArrayList<ArrayList<Integer>>  printVerticalOrder(Node A) throws IOException {
        if (A == null)
            return new ArrayList<>();
        Queue<QNode> queue = new LinkedList<>();
        queue.add(new QNode(0,A));
        while (!queue.isEmpty()) {
             QNode  node= queue.remove();
            map.putIfAbsent(node.level, new ArrayList<>());
            map.get(node.level).add(node.root.data);

            if (node.root.left != null)
                queue.add(new QNode( node.level - 1,node.root.left));
            if (node.root.right != null)
                queue.add(new QNode( node.level + 1,node.root.right));
        }
        return new ArrayList<>(map.values());
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
