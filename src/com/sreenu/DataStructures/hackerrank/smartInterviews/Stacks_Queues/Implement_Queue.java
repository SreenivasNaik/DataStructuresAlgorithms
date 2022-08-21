package com.sreenu.DataStructures.hackerrank.smartInterviews.Stacks_Queues;

import java.io.*;

/**
 * Created by SreenUNaik on 24-Sep-20.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class Implement_Queue {
    public static void main(String args[]) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        int r=-1;
        int f = -1;
        int n =100;
        int que[] = new int[n];
        for (int i = 0; i <t ; i++) {
            String[] opt = br.readLine().split(" ");
            String operation;
            int value = -1;
            if(opt.length>1){
                operation = opt[0];
                value = Integer.parseInt(opt[1]);
            }else {
                operation = opt[0];
            }
            if(operation.equalsIgnoreCase("Enqueue")){
                r=(r+1)%n;
                que[r] = value;
            }
             if(operation.equalsIgnoreCase("Dequeue")) {
                if (r == f)
                    bw.write("Empty\n");
                else {
                    bw.write(que[(f + 1) % n] + "\n");
                    f=(f+1)%n;
                }
            }
        }
        bw.flush();
    }
}
