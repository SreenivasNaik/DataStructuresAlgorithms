package com.sreenu.DataStructures.hackerrank.smartInterviews.Graphs;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by SreenUNaik on 07-Nov-20.
 * Problem : https://www.hackerrank.com/contests/smart-interviews/challenges/si-number-of-connected-components
 * Time Complexity :
 * Space Complexity :
 */
public class Number_of_Connected_Components {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            //bw.write("Test Case #" + (i + 1) + ":\n");
            String[] nm = br.readLine().split(" ");
            int n = Integer.parseInt(nm[0]);
            int m = Integer.parseInt(nm[1]);
            ArrayList<ArrayList<Integer>> graph = new ArrayList<>(n + 1);
            for (int j = 0; j < n + 1; j++) {
                graph.add(new ArrayList<>());
            }
            for (int j = 0; j < m; j++) {
                String[] uv = br.readLine().split(" ");
                int u = Integer.parseInt(uv[0]);
                int v = Integer.parseInt(uv[1]);
                graph.get(u).add(v);
                graph.get(v).add(u);
            }
            bw.write(findNoOfConnectedComponents(graph)+"\n");
        }
        bw.flush();
    }

    private static int findNoOfConnectedComponents(ArrayList<ArrayList<Integer>> graph) {
        int ans =0;
        boolean visited[] = new boolean[graph.size()];
        Arrays.fill(visited,false);
        for (int i = 1; i <=graph.size()-1 ; i++) {
            if (visited[i] == false){
                ans++;
                doDFS(graph,i,visited);
            }
        }
        return  ans;
    }

    private static void doDFS(ArrayList<ArrayList<Integer>> graph, int i, boolean[] visited) {
        if (visited[i] == true) return;
        visited[i] =true;
        for (int u : graph.get(i)){
            if (visited[u] ==false){

                doDFS(graph,u,visited);
            }
        }
    }
}

