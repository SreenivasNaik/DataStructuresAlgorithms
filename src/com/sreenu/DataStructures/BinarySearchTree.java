package com.sreenu.DataStructures;

import java.util.*;
import java.util.LinkedList;

/**
 * Created by SreenUNaik on 18-Sep-18.
 */
public class BinarySearchTree {
    BNode root;

    public void add(int value) {
        root = insertNodeRecursive(root, value);
    }

    public BNode insertNodeRecursive(BNode root,int data){
        if(root == null){
            root = new BNode(data);
            return root;
        }
        if(data<root.data){
            root.left = insertNodeRecursive(root.left,data);
            }
        else if(data > root.data){
            root.right = insertNodeRecursive(root.right,data);
        }
        return root;
    }

    public boolean searchRecursive(BNode current,int data){
        if(current == null){
            return false;
        }
        if(current.data == data){
            return true;
        }
        return data < current.data ? searchRecursive(current.left,data) : searchRecursive(current.right,data);
    }

    public void deleteData(int data){
        root = deleteRecursive(root,data);
    }

    private BNode deleteRecursive(BNode root, int data) {
        // Base Case :: If the Tree is Empty
        if(root == null)
            return root;
        //
        if(data < root.data)
            root.left = deleteRecursive(root.left,data);
        else if(data > root.data)
            root.right = deleteRecursive(root.right,data);
        else{
            if(root.left == null)
                return root.right;
            else if(root.right == null)
                return root.left;
            // Node with Two Childerns :: Get inOrder Successor ( smallest in right subtree)
            root.data = minValue(root.right);
            // Delete the InOrder successor
            root.right = deleteRecursive(root.right,root.data);

        }
        return root;
    }

    private int minValue(BNode root) {
        int min = root.data;
        if(root != null){
            min = root.left.data;
            root = root.left;
        }
        return min;
    }


    public boolean search(int data){
        return searchRecursive(root,data);
    }

    public void traverseInOrder(BNode node){
        if(node != null){
            traverseInOrder(node.left);
            System.out.print(node.data+"\t");
            traverseInOrder(node.right);
        }
    }
    public void traversePreorder(BNode node){
        if(node != null){
            System.out.print(node.data+"\t");
            traversePreorder(node.left);
            traversePreorder(node.right);
        }
    }
    public void traversePostOrder(BNode node){
        if(node != null){
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(node.data+"\t");
        }
    }
    public void printLevelOrder(BNode root){
        java.util.Queue<BNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            BNode temp = queue.poll();
            System.out.print(temp.data+"\t");
            if(temp.left != null){
                queue.add(temp.left);
            }
            if(temp.right != null){
                queue.add(temp.right);
            }
        }
    }

    public boolean isBST(BNode node){
        BNode prev = null;
        if(node != null){
            if(!isBST(node.left))
                return false;
            if(prev != null  && node.data <= prev.data)
                return false;
            prev = node;
            return isBST(node.right);
        }
        return true;
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.add(10);
        bst.add(20);
        bst.add(30);
        bst.add(15);
        bst.add(6);
        bst.add(7);
        bst.add(3);
        bst.add(5);
        bst.add(2);
        System.out.println("InOrder ->");
        bst.traverseInOrder(bst.root);
        System.out.println();
       /* System.out.println("PreOrder ->");
        bst.traversePreorder(bst.root);
        System.out.println();
        System.out.println("PostOrder ->");
        bst.traversePostOrder(bst.root);
        System.out.println();
        System.out.println("is Present :"+bst.search(15));
        System.out.println();
       // bst.deleteData(2);
        System.out.println("After deleting 2 : InOrder ->");
        bst.traverseInOrder(bst.root);
        System.out.println();
        bst.deleteData(10);
        System.out.println("After deleting 10 : InOrder ->");
        bst.traverseInOrder(bst.root);*/
        System.out.println("\nLevel Order ->");
        bst.printLevelOrder(bst.root);
        System.out.println("Is BST -> "+bst.isBST(bst.root) );

    }
}

class BNode{
 int data;
 BNode left,right;

    public BNode(int data) {
        this.data = data;
        left = right = null;
    }
}