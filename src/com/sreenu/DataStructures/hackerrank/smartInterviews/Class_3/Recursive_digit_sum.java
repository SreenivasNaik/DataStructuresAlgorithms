package com.sreenu.DataStructures.hackerrank.smartInterviews.Class_3;

/**
 * Created by SreenUNaik on 11-Aug-20.
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Recursive_digit_sum {

    // Complete the superDigit function below.
    static int superDigit(String n, int k) {
        if(n.length()==1)
            return Integer.parseInt(n);

        return Integer.parseInt(String.valueOf(n.charAt(0)))+superDigit(n.substring(1),k);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String[] nk = scanner.nextLine().split(" ");

        String n = nk[0];

        int k = Integer.parseInt(nk[1]);
        String s =n;
        for(int i =0;i<(k-1);i++){
            s= s+n;
        }
        int result = superDigit(s, k);
        System.out.println(result);
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
