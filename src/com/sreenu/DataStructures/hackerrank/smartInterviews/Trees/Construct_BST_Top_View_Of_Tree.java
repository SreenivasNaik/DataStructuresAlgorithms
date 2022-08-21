package com.sreenu.DataStructures.hackerrank.smartInterviews.Trees;

import java.io.*;
import java.util.*;

/**
 * Created by SreenUNaik on 05-Oct-20.
 * Problem :https://www.hackerrank.com/contests/smart-interviews/challenges/si-vertical-order-of-tree/problem
 * Time Complexity :
 * Space Complexity :
 */
public class Construct_BST_Top_View_Of_Tree {
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
            printTopView(root);

            }
        bw.flush();




    }

    private static void printTopView(Node root) {
        Queue<QNode> que = new LinkedList<QNode>();
        TreeMap<Integer, Node > topViewMap = new TreeMap<>();
        if (root == null)
            return;
        else
            que.add(new QNode(0,root));
        while (!que.isEmpty()){
            QNode obj = que.poll();
            if(!topViewMap.containsKey(obj.level)){
                topViewMap.put(obj.level,obj.root);
            }
            if (obj.root.left!=null)
                que.add(new QNode(obj.level-1,obj.root.left));
            if (obj.root.right!=null)
                que.add(new QNode(obj.level+1,obj.root.right));

        }
        for (Map.Entry<Integer, Node> entry : topViewMap.entrySet()) {
            System.out.print(entry.getValue().data+" ");
        }

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
