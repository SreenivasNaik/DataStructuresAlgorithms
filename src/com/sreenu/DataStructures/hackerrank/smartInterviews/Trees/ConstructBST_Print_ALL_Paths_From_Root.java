package com.sreenu.DataStructures.hackerrank.smartInterviews.Trees;

import java.io.*;
import java.util.Iterator;
import java.util.Stack;

public class ConstructBST_Print_ALL_Paths_From_Root {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
   static Stack<Integer> data = new Stack<>() ;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a[] = br.readLine().split(" ");
       Node root = null;
        for (int j = 0; j <a.length ; j++) {
            root = insertNode(root,Integer.parseInt(a[j]));
        }
printAllPathsFromRoot(root);

    }
    static void printAllPathsFromRoot(Node root){
        if(root==null)
            return;
        data.push(root.data);
        printAllPathsFromRoot(root.left);
        if(root.left==null && root.right == null )
            printPath();
        printAllPathsFromRoot(root.right);
        data.pop();


    }

    private static void printPath() {
        Iterator value = data.iterator();
        while (value.hasNext()) {
            System.out.print(value.next()+"->");
        }
        System.out.println();
    }

    static Node insertNode(Node root,int data){
        if(root==null){
            root = new Node(data);
            return root;
        }
        if(data< root.data)
            root.left =    insertNode(root.left,data);
        else
          root.right =   insertNode(root.right,data);
        return root;
    }
    static class Node{
        int data;
        Node left,right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }
}
