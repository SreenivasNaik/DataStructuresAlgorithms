package com.sreenu.DataStructures;

/**
 * Created by SreenUNaik on 15-Sep-20.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class SPOJ {

    // Java program for Naive Pattern Searching


        public static void search(String txt, String pat)
        {
            int M = pat.length();
            int N = txt.length();

        /* A loop to slide pat one by one */
            for (int i = 0; i <= N - M; i++) {

                int j;

            /* For current index i, check for pattern
              match */
                for (j = 0; j < M; j++)
                    if (txt.charAt(i + j) != pat.charAt(j))
                        break;

                if (j == M) // if pat[0...M-1] = txt[i, i+1, ...i+M-1]
                    System.out.println( i+"to"+(i+pat.length()));
            }
        }

        public static void main(String[] args)
        {
            String txt = "emmcimciizfxmmmmmcmciizfxmmmmciizfxmmmciizfxmmciizfxmmmizmciizfxmciizfxmmmmpo";
            String pat = "mciizfxmm";
            search(txt, pat);
        }
    }

