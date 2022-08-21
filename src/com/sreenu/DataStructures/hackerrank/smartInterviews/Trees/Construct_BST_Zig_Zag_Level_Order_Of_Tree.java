package com.sreenu.DataStructures.hackerrank.smartInterviews.Trees;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by SreenUNaik on 05-Oct-20.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class Construct_BST_Zig_Zag_Level_Order_Of_Tree {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
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
            printLevelOrder(root);
            bw.write("\n");
        }
        bw.flush();

    }

    private static void printLevelOrder(Node root) throws IOException {
      if (root == null) return;

      // stacks for current order and nextLevel
        Stack<Node> currentLevel = new Stack<>();
        Stack<Node> nextLevel = new Stack<>();
        currentLevel.push(root);
        boolean leftToRight = true;
        while (!currentLevel.isEmpty()){
            Node node = currentLevel.pop();
            bw.write(node.data+" ");
            if (!leftToRight){
                if (node.left!=null)
                    nextLevel.push(node.left);
                if (node.right!=null)
                    nextLevel.push(node.right);
            }else {
                if (node.right!=null)
                    nextLevel.push(node.right);
                if (node.left!=null)
                    nextLevel.push(node.left);
            }
            if (currentLevel.isEmpty()){
                leftToRight = !leftToRight;
                Stack<Node> temp = currentLevel;
                currentLevel = nextLevel;
                nextLevel = temp;
            }
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
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }

}
