package com.sreenu.DataStructures.InterviewBit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by SreenUNaik on 25-Aug-20.
 * Problem : https://www.interviewbit.com/problems/2-sum/
 * Time Complexity :
 * Space Complexity :
 */
public class Two_Sum {
    public static void main(String[] args) {
List<Integer> a = new ArrayList<>();
a.add(2);
a.add(7);
a.add(11);
a.add(15);
        System.out.println(twoSum(a,9));
    }
    public static ArrayList<Integer> twoSum(final List<Integer> A, int B) {
        HashMap<Integer,Integer> count = new HashMap<>();
        ArrayList<Integer> index = new ArrayList<>();
        for (int i = 0; i < A.size(); i++) {
            int a = A.get(i);
            int b = B-a;
            if(count.containsKey(b)){
                index.add(count.get(b));
                index.add(i + 1);
                break;
            }
            else{
                count.putIfAbsent(a,i+1);
            }
        }
        return index;
    }
}
