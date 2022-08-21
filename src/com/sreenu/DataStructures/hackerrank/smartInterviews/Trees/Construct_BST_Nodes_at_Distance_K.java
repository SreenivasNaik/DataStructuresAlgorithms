package com.sreenu.DataStructures.hackerrank.smartInterviews.Trees;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by SreenUNaik on 04-Oct-20.
 * Problem : https://www.hackerrank.com/contests/smart-interviews/challenges/si-level-order-of-tree
 * Time Complexity :
 * Space Complexity :
 */
public class Construct_BST_Nodes_at_Distance_K {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static  int ans =0;
    static ArrayList<Integer> nodes = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine());
        for (int i = 0; i < tc; i++) {
            String NSK[] = br.readLine().split(" ");
            int n = Integer.parseInt(NSK[0]);
            int source = Integer.parseInt(NSK[1]);
            int k = Integer.parseInt(NSK[2]);
            String a[] = br.readLine().split(" ");
            Node root = null;
            for (int j = 0; j <a.length ; j++) {
                root = insertNode(root,Integer.parseInt(a[j]));
            }
            NodesAtDistanceK(root,source,k);

            bw.write(nodes.size()+"\n");
            nodes.clear();
            ans =0;
        }
        bw.flush();

    }

    private static int NodesAtDistanceK(Node root, int source, int k) {
        if(root ==null)
            return -1;
        if (root!=null && root.data==source) {
            getKdistanceNodeDown(root,k);
            return 0;
        }
        int left = NodesAtDistanceK(root.left,source,k);
        if (left!=-1){
            if(left+1 == k)
                nodes.add(root.data);
            else
             getKdistanceNodeDown(root.right,k-left-2);
            return left+1;
        }
            int right = NodesAtDistanceK(root.right,source,k);
            if(right!=-1)
            {
                if (right+1==k)
                    nodes.add(root.data);
                else
                 getKdistanceNodeDown(root.left,k-right-2);
                return right+1;
            }

        return -1;
    }

    static  void getKdistanceNodeDown(Node s, int k){
        if (s==null || k<0)
            return ;
        if (k==0) {
            nodes.add(s.data);
            return;
        }
        getKdistanceNodeDown(s.left,k-1);
        getKdistanceNodeDown(s.right,k-1);
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
