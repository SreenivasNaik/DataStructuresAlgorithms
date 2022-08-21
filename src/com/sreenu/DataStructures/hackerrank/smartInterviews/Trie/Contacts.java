package com.sreenu.DataStructures.hackerrank.smartInterviews.Trie;

import java.util.ArrayList;

/**
 * Created by SreenUNaik on 19-Oct-20.
 * Problem : https://www.hackerrank.com/challenges/contacts/problem
 * Time Complexity :
 * Space Complexity :
 * 4
 add hack
 add hackerrank
 find hac
 find hak
 Your Output (stdout)
 2
 0
 */
public class Contacts {

    static void insert(Node root, String w) {
        for(int i=0;i<w.length();i++) {
            int idx=w.charAt(i)-97;
            if(root.c[idx]==null) {
                root.c[idx]=new Node();
            }

            root=root.c[idx];
            root.cnt++;
        }
    }
    static int query(Node root, String w) {
        for(int i=0;i<w.length();i++) {
            int idx=w.charAt(i)-97;
            if(root.c[idx]==null) {
                return 0;
            }

            root=root.c[idx];
        }
        return root.cnt;
    }
    static int[] contacts(String[][] queries, int queriesRows) {
        int nGet=0;
        ArrayList<Integer> list=new ArrayList<Integer>();
        Node root=new Node();
        for (int queriesRowItr = 0; queriesRowItr < queriesRows; queriesRowItr++) {

            String operation = queries[queriesRowItr][0];
            String value = queries[queriesRowItr][1];
            System.out.println("Operation: "+operation+"  Value: "+value);
            if(operation.equals("add")){
                insert(root,value);
            }
            if(operation.equals("find")){
                nGet++;
                int a=query(root,value);
                list.add(a);
            }




        }
        System.out.println("nGet Value: "+nGet);
        int result[]=new int[nGet];
        for(int i=0;i<nGet;i++) {
            result[i]=list.get(i);
        }
        return result;
    }

    static class Node {
        Node c[]=new Node[26];
        int cnt;
        boolean isLeaf;

        Node(){
            this.cnt=0;
            this.isLeaf=false;
            for(int i=0;i<26;i++){
                this.c[i]=null;
            }
        }
    }
}
