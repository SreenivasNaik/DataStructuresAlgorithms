package com.sreenu.DataStructures.hackerrank.smartInterviews.Stacks_Queues;

import java.io.*;

/**
 * Created by SreenUNaik on 24-Sep-20.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class Collecting_Water {

        public static void main(String args[]) throws IOException {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
            int T=Integer.parseInt(br.readLine());
            for(int t=0;t<T;t++) {
                int n=Integer.parseInt(br.readLine());
                String[] inp=br.readLine().split(" ");
                int ar[]=new int[n];
                for(int j=0;j<n;j++)
                    ar[j]=Integer.parseInt(inp[j]);

                //logic goes here
                int ans=solve(ar,n);
                bw.write(ans+"\n");
            }
            bw.flush(); //after all test cases
        }

        static int solve(int ar[], int n) {
            int ml[]=new int[n];
            ml[0]=ar[0];
            for(int i=1;i<n;i++){
                ml[i]=Math.max(ml[i-1],ar[i]);
            }

            int mr[]=new int[n];
            mr[n-1]=ar[n-1];
            for(int i=n-2;i>=0;i--) {
                mr[i]=Math.max(mr[i+1],ar[i]);
            }
            int ans=0;
            for(int i=0;i<n;i++) {
                ans=ans+Math.min(ml[i],mr[i])-ar[i];
            }
            return ans;
        }

    }
