package com.sreenu.DataStructures.hackerrank.smartInterviews;

import java.util.Scanner;

/**
 * Created by SreenUNaik on 11-Aug-20.
 */


import java.util.Scanner;

public class Si_rotation_of_matrix
{
    static void rotate90Clockwise(int a[][],int N)
    {


        for (int i = 0; i < N / 2; i++)
        {
            for (int j = i; j < N - i - 1; j++)
            {

                int temp = a[i][j];
                a[i][j] = a[N - 1 - j][i];
                a[N - 1 - j][i] = a[N - 1 - i][N - 1 - j];
                a[N - 1 - i][N - 1 - j] = a[j][N - 1 - i];
                a[j][N - 1 - i] = temp;
            }
        }
    }
    static void transpose(int arr[][])
    {
        for (int i = 0; i < arr.length; i++)
            for (int j = i; j < arr[0].length;j++) {
                int temp = arr[j][i];
                arr[j][i] = arr[i][j];
                arr[i][j] = temp;
            }
    }

    static void printMatrix(int arr[][])
    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length;
                 j++)
                System.out.print(arr[i][j] + " ");
            System.out.println("");
        }
    }


    static void rotate90(int arr[][],int size)
    {
        rotate90Clockwise(arr,size);

    }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int tc = Integer.parseInt(sc.nextLine());
        for(int i=0;i<tc;i++){
            int size = sc.nextInt();
            if(size==1){
                System.out.println("Test Case #"+(i+1)+":");
                System.out.println(sc.nextInt());
            }else {
                int[][] arr = new int[size][size];
                for (int j = 0; j <size;j++){
                    for(int k=0;k<size;k++){
                        arr[j][k] = sc.nextInt();
                    }
                }

                rotate90(arr,size);
                System.out.println("Test Case #"+(i+1)+":");
                printMatrix(arr);

            }
        }

    }
}
