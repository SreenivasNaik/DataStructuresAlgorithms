package com.sreenu.DataStructures.hackerrank.smartInterviews.Class_3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by SreenUNaik on 10-Aug-20.
 */
//
// https://www.hackerrank.com/contests/smart-interviews/challenges/si-tower-of-hanoi/submissions/code/1325614025
public class Tower_of_Hanoi_Using_Recuursion {
    static  int count =0;
    static  List<String> moves = new LinkedList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc= Integer.parseInt(sc.nextLine());
        for(int i=0;i<tc;i++){
            int NumberOfDisks = Integer.parseInt(sc.nextLine());
            String source = "A";
            String temp = "B";
            String destination = "C";



            towerOfHanoi(NumberOfDisks,source,destination,temp);
            System.out.println(count);
            for(int j=0;j<moves.size();j++){
                System.out.println(moves.get(j));
            }
            count =0;
            moves.clear();
        }

    }

    private static void towerOfHanoi(int numberOfDisks, String source, String destination, String temp) {

        if(numberOfDisks ==0)
            return;
        towerOfHanoi(numberOfDisks-1,source,temp,destination);
        count++;
        moves.add("Move "+ numberOfDisks+" from "+source+" to "+destination);
        towerOfHanoi(numberOfDisks-1,temp,destination,source);

    }
}
