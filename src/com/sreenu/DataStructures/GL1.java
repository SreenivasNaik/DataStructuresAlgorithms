package com.sreenu.DataStructures;

import java.util.Scanner;

/**
 * Created by SreenUNaik on 19-Apr-20.
 */
public class GL1 {
    private static int n;

    public static int findCircleNum(int[][] M) {
        if(M==null || M.length==0) return 0;

        n = M.length;
        boolean[] visited = new boolean[n];

        int res = 0;
        for(int i=0; i<n; i++){
            if(!visited[i]){
                dfs(M, i, visited);
                res++;
            }
        }
        return res;
    }

    private static void dfs(int[][] M, int i, boolean[] visited){
        if(visited[i]) return;

        visited[i]=true;
        for(int j=0; j<n; j++){
            if(M[i][j]==1 && !visited[j])
                dfs(M, j, visited);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine());
        int m[][] = new int[size][size];
        for(int i=0;i<size;i++){
            String sr = sc.nextLine();
            for(int j=0;j<size;j++){
               m[i][j] =Integer.parseInt(Character.toString(sr.charAt(j)));
            }
        }
        System.out.println(findCircleNum(m));
    }
}
