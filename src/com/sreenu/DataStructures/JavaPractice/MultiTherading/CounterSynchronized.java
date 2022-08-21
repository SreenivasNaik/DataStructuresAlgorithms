package com.sreenu.DataStructures.JavaPractice.MultiTherading;

/**
 * Created by SreenUNaik on 01-Mar-21.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class CounterSynchronized {
    private long count =0;

    public synchronized long getCount() {
        return this.count;
    }

    public synchronized long incCount() {
        return this.count++;
    }
}
