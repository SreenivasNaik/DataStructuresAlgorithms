package com.sreenu.DataStructures.JavaPractice;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * Created by SreenUNaik on 26-Feb-21.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class Treeset {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(2);
        treeSet.add(20);
        treeSet.add(1);
        treeSet.add(10);
        System.out.println(treeSet);
        TreeSet<Integer> treeSet1 = new TreeSet<>((Comparator.reverseOrder()));
        treeSet1.add(2);
        treeSet1.add(20);
        treeSet1.add(1);
        treeSet1.add(10);
        System.out.println(treeSet1);
    }
}
