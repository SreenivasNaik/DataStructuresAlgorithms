package com.sreenu.DataStructures.hackerrank.smartInterviews;

import java.util.Scanner;

/**
 * Created by SreenUNaik on 02-Sep-20.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class Spiral_Traversal_of_Matrix {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int z=scn.nextInt();
        for(int Z=0;Z<z;Z++){
            int n=scn.nextInt();
            int last_row=n-1;
            int last_col=n-1;
            //int i, k=0, l=0;
            int[][] mat=new int[n][n];
            for(int x=0;x<n;x++){
                for(int y=0;y<n;y++){
                    mat[x][y]=scn.nextInt();
                }
            }
            int m=n;
            int i, k = 0, l = 0;

            while (k < m && l < n) {
                // Print the first row from the remaining rows
                for (i = l; i < n; ++i) {
                    System.out.print(mat[k][i] + " ");
                }
                k++;

                // Print the last column from the remaining columns
                for (i = k; i < m; ++i) {
                    System.out.print(mat[i][n - 1] + " ");
                }
                n--;

                // Print the last row from the remaining rows */
                if (k < m) {
                    for (i = n - 1; i >= l; --i) {
                        System.out.print(mat[m - 1][i] + " ");
                    }
                    m--;
                }

                // Print the first column from the remaining columns */
                if (l < n) {
                    for (i = m - 1; i >= k; --i) {
                        System.out.print(mat[i][l] + " ");
                    }
                    l++;
                }
            }

            System.out.println();
        }
    }
}
