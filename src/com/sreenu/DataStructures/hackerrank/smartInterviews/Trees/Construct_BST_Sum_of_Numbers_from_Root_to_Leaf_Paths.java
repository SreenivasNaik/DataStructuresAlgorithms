package com.sreenu.DataStructures.hackerrank.smartInterviews.Trees;

import java.io.*;

/**
 * Created by SreenUNaik on 06-Oct-20.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class Construct_BST_Sum_of_Numbers_from_Root_to_Leaf_Paths {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static long M = (long) 1e9+7;
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
            bw.write(SumOfNumbersFromRootToLeafPaths(root,0)+"\n");
        }
        bw.flush();

    }

    private static long SumOfNumbersFromRootToLeafPaths(Node root, long sum) {
        if (root == null) return 0;
        sum = (((sum%M*(computePower(10,digits(root.data)))%M)%M)%M+(root.data)%M)%M;
        if (root.left==null && root.right==null)
            return sum%M;
        return (SumOfNumbersFromRootToLeafPaths(root.left,sum)%M+SumOfNumbersFromRootToLeafPaths(root.right,sum)%M)%M;
    }

    private static long digits(int t) {
        if(t==0){
            return 1;
        }
        int d=10;
        long c=0;
        while(t!=0){
            t=t/d;
            c++;
        }
        return c;

    }

    private static long computePower(long a, long b) {
        long x = a; long ans =1;
        for(int i=0;i<31;i++){
            if(checkBit(b,i)==true){
                ans = (long)(((ans%M)*(x%M))%M);
                //ans = ans*x;
            }
            x = (long)(x%M);
            x=(long) ((x*x)%M);

        }
        // ans = (long)(ans%M);
        return ans;
    }

    private static boolean checkBit(long inputNumber, int bitPosition) {
        long shift = (inputNumber>>bitPosition)&1;
        return  shift!=0;
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
