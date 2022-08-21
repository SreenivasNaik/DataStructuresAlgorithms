package com.sreenu.DataStructures.hackerrank.smartInterviews.Graphs;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by SreenUNaik on 07-Nov-20.
 * Problem :https://www.hackerrank.com/contests/smart-interviews/challenges/si-path-in-a-graph
 * Time Complexity :
 * Space Complexity :
 */
public class Path_in_a_Graph_DFS {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            bw.write("Test Case #"+(i+1)+":\n");
            String[] nm = br.readLine().split(" ");
            int n = Integer.parseInt(nm[0]);
            int m = Integer.parseInt(nm[1]);
            ArrayList<ArrayList<Integer>> graph = new ArrayList<>(n+1);
            for (int j = 0; j <n+1 ; j++) {
                graph.add(new ArrayList<>());
            }
            for (int j = 0; j <m ; j++) {
                String[] uv = br.readLine().split(" ");
                int u = Integer.parseInt(uv[0]);
                int v = Integer.parseInt(uv[1]);
                graph.get(u).add(v);
                graph.get(v).add(u);
            }
            int q = Integer.parseInt(br.readLine());
            for (int j = 0; j < q; j++) {
                String[] uv = br.readLine().split(" ");
                int u = Integer.parseInt(uv[0]);
                int v = Integer.parseInt(uv[1]);
                boolean visited[] = new boolean[n+1];
                Arrays.fill(visited,false);
                visited[u] = true;
                boolean valeu=    doDFStraversalForPath(graph,u,v,visited);
             if (valeu){
                 bw.write("Yes\n");
             }else {
                 bw.write("No\n");
             }
            }
            bw.flush();


        }

    }

    private static boolean doDFStraversalForPath(ArrayList<ArrayList<Integer>> graph, int source, int destination, boolean[] visited) {
      if (destination == source)
          return  true;

      for (int u :graph.get(source)){
          if (visited[u] == false) {
              visited[u] = true;
              if (doDFStraversalForPath(graph, u, destination, visited) == true) {
                  return true;
              }
          }
      }
      return false;
    }
}
