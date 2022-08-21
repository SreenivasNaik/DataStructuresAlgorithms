package com.sreenu.DataStructures.hackerrank.smartInterviews.Trees;

import java.io.*;

/**
 * Created by SreenUNaik on 04-Oct-20.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class Construct_BST_Find_Depth_of_Tree_Nodes {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine());
        for (int i = 0; i < tc; i++) {
            int N = Integer.parseInt(br.readLine());
            String a[] = br.readLine().split(" ");
            Node root = null;
            for (int j = 0; j <a.length ; j++) {
                root = insertNode(root,Integer.parseInt(a[j]),0);
            }
            bw.write("\n");
        }
        bw.flush();

    }

    private static int heightOfTree(Node root) {
        if(root == null) return -1;
        return 1+Math.max(heightOfTree(root.left),heightOfTree(root.right));
    }

    private static Node insertNode(Node root, int i,int depth) throws IOException {
        if(root == null) {
            root = new Node(i,depth);
            bw.write(depth+" ");
            return root;
        }
        if(i<root.data)
            root.left = insertNode(root.left,i,depth+1);
        else
            root.right = insertNode(root.right,i,depth+1);
        return root;
    }
    static class Node{
        int data;
        int depth;
        Node left;
        Node right;

        public Node(int data,int depth) {
            this.data = data;
            this.depth = depth;
            left = right = null;
        }
    }

}
