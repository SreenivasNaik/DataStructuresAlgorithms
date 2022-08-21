package com.sreenu.DataStructures.hackerrank.smartInterviews.Trees;

import java.io.*;

/**
 * Created by SreenUNaik on 06-Oct-20.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class PreOrder_InOrder_To_PostOrder {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int pos =0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        for (int i = 0; i <tc ; i++) {
            int size = Integer.parseInt(br.readLine());
            String preOrder[] = br.readLine().split(" ");
            String inOrder[] = br.readLine().split(" ");
            printPostOrder(preOrder,inOrder,0,size-1);
            bw.write("\n");
            pos =0;
        }
        bw.flush();
    }

    private static void printPostOrder(String[] preOrder, String[] inOrder, int low, int high) throws IOException {
        if(low>high) return;
        int index = search(Integer.parseInt(preOrder[pos]),inOrder,low,high);
        pos++;
        printPostOrder(preOrder,inOrder,low,index-1);
        printPostOrder(preOrder,inOrder,index+1,high);
        int postOrderVal = Integer.parseInt(inOrder[index]);
        bw.write(postOrderVal+" ");

    }

    private static int search(int key, String[] inOrder, int low, int high) {
        int index =0;
        for (int j = low; j <=high ; j++) {
            if(Integer.parseInt(inOrder[j])==key){
                index =j;
                break;
            }
        }
        return index;
    }
}
