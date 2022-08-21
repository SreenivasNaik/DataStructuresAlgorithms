package com.sreenu.DataStructures.codeChef;

import java.io.*;
import java.util.Scanner;

/**
 * Created by SreenUNaik on 12-Aug-20.
 */
public class Chef_Wars {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for (int t = 0; t < T; t++) {
            String s[] = br.readLine().split(" ");
            int H = Integer.parseInt(s[0]);
            int P = Integer.parseInt(s[1]);
            if (H <= P) {
                System.out.println(1);
            } else {
                while (P != 0) {
                    H = H - P;
                    P = P / 2;
                    if (H <= 0)
                        break;
                }
                if (P == 0 && H != 0) {
                    System.out.println(0);
                }
                if (H <= 0 && P > 0) {
                    System.out.println(1);
                }
            }

        }

        //    bw.write(ans+"\n");
        bw.flush(); //after all test cases
    }


}
