package com.sreenu.DataStructures.hackerrank.smartInterviews.Class_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by SreenUNaik on 10-Aug-20.
 */
public class FindMissingNumberInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = Integer.parseInt(sc.nextLine());
        for(int i=0;i<tc;i++){
            int size = Integer.parseInt(sc.nextLine());
            String n[] =  sc.nextLine().split(" ");
            System.out.println(MissingNumber(n,size));
        }

    }

    private static int MissingNumber(String[] A, int n) {
        int check[] = new int[n+2];
        int missing =0;
        for(int i = 0; i<n; i++){
            if (check[Integer.parseInt(A[i])] ==  0)
            {
                check[Integer.parseInt(A[i])] = 1;
            }

        }
        for(int j =1; j<n+2; j++){
            if (check[j] == 0)
            {
                missing = j;
            }
        }
      return  missing;
    }


}
