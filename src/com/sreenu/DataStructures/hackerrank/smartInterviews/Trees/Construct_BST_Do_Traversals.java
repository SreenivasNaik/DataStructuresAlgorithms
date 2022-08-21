package com.sreenu.DataStructures.hackerrank.smartInterviews.Trees;

import java.io.*;

/**
 * Created by SreenUNaik on 04-Oct-20.
 * Problem :https://www.hackerrank.com/contests/smart-interviews/challenges/si-tree-traversals/submissions/code/1327084493
 * Time Complexity : N
 * Space Complexity :
 */
public class Construct_BST_Do_Traversals {
    static BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));
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
            preOrderTraversal(root);
            bw.write("\n");
            inOrderTraversal(root);
            bw.write("\n");
            postOrderTraversal(root);
            bw.write("\n");
            bw.write("\n");
        }
        bw.flush();

    }

    private static void postOrderTraversal(Node root) throws IOException {
        if (root == null) return;
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
     bw.write(root.data+" ");
    }

    private static void inOrderTraversal(Node root) throws IOException {
        if(root == null) return;
        inOrderTraversal(root.left);
        bw.write(root.data+" ");
        inOrderTraversal(root.right);

    }

    private static void preOrderTraversal(Node root) throws IOException {
        if(root == null) return;
       bw.write(root.data+" ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
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


