package com.sreenu.DataStructures.Spoj;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by SreenUNaik on 15-Sep-20.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class PRIME_1 {

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int t = Integer.parseInt(br.readLine());
            while (t-- > 0) {
                int m, n;
                String[] inp=br.readLine().split(" ");
                m=Integer.parseInt(inp[0]);
                n=Integer.parseInt(inp[1]);
                List<Integer> al = new ArrayList<>();
                m = m==1 ? m+1 : m;
                for (int i = m; i <= n; i++) {
                    if (isPrime(i)) {
                        al.add(i);
                    }
                } for (int i = 0; i < al.size(); i++) {
                    System.out.println(al.get(i));
                }
            }
        }

        static boolean isPrime(int n) {

            for (int j = 2; j <= Math.sqrt(n); j++) {
                if (n % j == 0) {
                    return false;
                }
            }
            return true;
        }
}
