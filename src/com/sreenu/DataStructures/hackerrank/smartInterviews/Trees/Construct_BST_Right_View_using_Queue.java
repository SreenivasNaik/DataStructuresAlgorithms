package com.sreenu.DataStructures.hackerrank.smartInterviews.Trees;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by SreenUNaik on 04-Oct-20.
 * Problem : https://www.hackerrank.com/contests/smart-interviews/challenges/si-level-order-of-tree
 * Time Complexity :
 * Space Complexity :
 */
public class Construct_BST_Right_View_using_Queue {
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
        Queue<Node> queue = new LinkedList<>();

        queue.add(root);
        while (!queue.isEmpty()) {
            int n = queue.size();
            for (int i = 1; i <= n; i++) {
                Node temp = queue.poll();
                if (i == n) {
                    if (temp != null) {
                        bw.write(temp.data + " ");
                    }
                }
                if(temp!=null && temp.left !=null)
                    queue.add(temp.left);
                if(temp!=null && temp.right !=null)
                    queue.add(temp.right);

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
    }

}
