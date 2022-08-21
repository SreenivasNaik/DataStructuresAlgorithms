package com.sreenu.DataStructures;
import java.io.*;
import java.util.*;


public class CountPairs {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int N = Integer.parseInt(br.readLine().trim());
        String[] arr_color = br.readLine().split(" ");
        int[] color = new int[N];
        for(int i_color = 0; i_color < arr_color.length; i_color++)
        {
            color[i_color] = Integer.parseInt(arr_color[i_color]);
        }
        int[][] edges = new int[N-1][2];
        for(int i_edges = 0; i_edges < N-1; i_edges++)
        {
            String[] arr_edges = br.readLine().split(" ");
            for(int j_edges = 0; j_edges < arr_edges.length; j_edges++)
            {
                edges[i_edges][j_edges] = Integer.parseInt(arr_edges[j_edges]);
            }
        }

        long out_ = CountPair(N, color, edges);
        System.out.println(out_);

        wr.close();
        br.close();
    }
    static long CountPair(int N, int[] color, int[][] edges){
        // Write your code here

return 0;
    }
}