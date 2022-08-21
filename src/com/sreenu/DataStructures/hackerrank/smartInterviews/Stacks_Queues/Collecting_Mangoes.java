package com.sreenu.DataStructures.hackerrank.smartInterviews.Stacks_Queues;

import java.io.*;
import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by SreenUNaik on 24-Sep-20.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class Collecting_Mangoes {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(reader.readLine());
        for (int i = 0; i < t; i++) {
            bw.write("Case " + String.valueOf(i + 1) + ":" + "\n");
            Stack<Integer> a = new Stack<Integer>();
            Stack<Integer> m = new Stack<Integer>();
            int n = Integer.parseInt(reader.readLine());
            ArrayList<String> al = new ArrayList<String>();
            for (int j = 0; j < n; j++)
                al.add(reader.readLine());
            for (int k = 0; k < al.size(); k++) {
                String x = al.get(k).substring(0, 1);
                if (x.equals("A")) {
                    int y = Integer.parseInt(al.get(k).substring(2, al.get(k).length()));
                    int lo = y;
                    if (!m.isEmpty() && y < m.peek())
                        lo = m.peek();
                    a.push(y);
                    m.push(lo);
                } else if (x.equals("R")) {
                    if (!a.isEmpty() && !m.isEmpty()) {
                        int hjk = a.pop();
                        int yhju = m.pop();
                    }
                } else if (x.equals("Q")) {
                    if (m.size() > 0)
                        bw.write(String.valueOf(m.peek()) + "\n");
                    else
                        bw.write("Empty"+"\n");
                }
            }
            bw.flush();
        }
    }
}
