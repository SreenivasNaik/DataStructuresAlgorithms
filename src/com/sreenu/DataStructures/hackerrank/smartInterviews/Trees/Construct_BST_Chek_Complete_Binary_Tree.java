package com.sreenu.DataStructures.hackerrank.smartInterviews.Trees;

import java.io.*;

/**
 * Created by SreenUNaik on 06-Oct-20.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class Construct_BST_Chek_Complete_Binary_Tree {
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
            if(isComplete(root,0,N))
                bw.write("Yes"+"\n");
            else
                bw.write("No\n");
        }
        bw.flush();

    }
    static boolean isComplete(Node root, int index, int number_nodes)
    {
        // An empty tree is complete
        if (root == null)
            return true;

        // If index assigned to current node is more than
        // number of nodes in tree, then tree is not complete
        if (index >= number_nodes)
            return false;

        // Recur for left and right subtrees
        return (isComplete(root.left, 2 * index + 1, number_nodes)
                && isComplete(root.right, 2 * index + 2, number_nodes));

    }
    static int countNodes(Node root)
    {
        if (root == null)
            return (0);
        return (1 + countNodes(root.left) + countNodes(root.right));
    }
    private static String isFullBinaryTree(Node root) {
        if(root == null) return "True";
        if(root.left == null && root.right==null) return "True";
        if(root.left!=null && root.right!=null) {
          if  (isFullBinaryTree(root.left).equalsIgnoreCase("True")
                    && isFullBinaryTree(root.right).equalsIgnoreCase("True")){
              return "True";
          }else {
              return "False";
          }

        }
        return "False";
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
