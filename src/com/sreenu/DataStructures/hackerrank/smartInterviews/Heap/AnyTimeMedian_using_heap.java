package com.sreenu.DataStructures.hackerrank.smartInterviews.Heap;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

/**
 * Created by SreenUNaik on 19-Oct-20.
 * Problem :https://www.hackerrank.com/contests/smart-interviews/challenges/si-anytime-median
 * Time Complexity :
 * Space Complexity :
 */
public class AnyTimeMedian_using_heap {
    public static void findMedian(ArrayList<Integer> ar,int n,BufferedWriter bw) throws IOException {

        PriorityQueue<Integer> p = new PriorityQueue<Integer>(Collections.reverseOrder());
        PriorityQueue<Integer> p1 = new PriorityQueue<Integer>();

        for(int i=0;i<n;i++) {
            if(p.size()>0) {
                if(p.peek()>ar.get(i)) {
                    p.add(ar.get(i));
                }else {
                    p1.add(ar.get(i));
                }
            }else {
                p.add(ar.get(i));
            }
            if(p.size()-p1.size()>1 && p.size()-p1.size()>0) {
                p1.add(p.poll());
            }else if(p.size()-p1.size()<0) {
                p.add(p1.poll());
            }
            bw.write(p.peek()+" ");
        }
    }
    public static void main(String[] args) throws NumberFormatException, IOException {
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        for(int m=0;m<t;m++) {
            int n = Integer.parseInt(br.readLine());
            String s[] = br.readLine().split(" ");
            ArrayList<Integer> ar = new ArrayList<Integer>();
            for(int i=0;i<n;i++) {
                ar.add(Integer.parseInt(s[i]));
            }
            findMedian(ar, n, bw);
            bw.newLine();
        }
        bw.flush();
    }


}
