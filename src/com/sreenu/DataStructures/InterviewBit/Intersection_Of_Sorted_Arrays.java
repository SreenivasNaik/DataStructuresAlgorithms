package com.sreenu.DataStructures.InterviewBit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by SreenUNaik on 29-Aug-20.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class Intersection_Of_Sorted_Arrays {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays. asList(10000));
        ArrayList<Integer> b = new ArrayList<>(Arrays. asList(10000));
        System.out.println(Arrays.toString(intersect(a,b).toArray()));

    }
    public static ArrayList<Integer> intersect(final List<Integer> A, final List<Integer> B) {
        ArrayList<Integer> intersect  = new ArrayList<>();
        int p1=0, p2=0;
        while (p1<A.size() && p2<B.size()){
            int a = A.get(p1);
            int b = B.get(p2);
            if(a == b){
                intersect.add(A.get(p1));
                p1++;
                p2++;
            }else if(A.get(p1)>B.get(p2)) {
                p2++;
            }else {
                p1++;
            }
        }
        return intersect;
    }
}
