package com.sreenu.DataStructures.InterviewBit;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by SreenUNaik on 29-Aug-20.
 * Problem : https://www.interviewbit.com/problems/merge-two-sorted-lists-ii/
 * Time Complexity : N+M
 * Space Complexity : N+M
 */
public class Merge_Two_Sorted_Lists {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays. asList(-4,3));
        ArrayList<Integer> b = new ArrayList<>(Arrays. asList(-2,-2));
        merge(a,b);
        System.out.println(a);
    }
    public static void merge(ArrayList<Integer> a, ArrayList<Integer> b) {
        int p1=0,p2=0;
        ArrayList<Integer> c = new ArrayList<>(a.size()+b.size());
        while(p1<a.size() && p2<b.size()){
            if(a.get(p1)<b.get(p2)){
                c.add(a.get(p1));
                p1++;
            }else{
                c.add(b.get(p2));
                p2++;
            }
        }
        while (p1<a.size()){
            c.add(a.get(p1));
            p1++;
        }
        while (p2<b.size()){
            c.add(b.get(p2));
            p2++;
        }
        a.clear();
        a.addAll(c);
    }
}
