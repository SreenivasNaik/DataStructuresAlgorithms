package com.sreenu.DataStructures.JavaPractice.MultiTherading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by SreenUNaik on 01-Mar-21.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class CounterLock {
    private long count =0;
private Lock lock = new ReentrantLock();
public void inc(){
    try {
    lock.lock();
    this.count++;
    }finally {
        lock.unlock();
    }
}
public long getCount(){
    try{
        lock.lock();
        return this.count;
    }finally {
        lock.unlock();
    }
    }

}
