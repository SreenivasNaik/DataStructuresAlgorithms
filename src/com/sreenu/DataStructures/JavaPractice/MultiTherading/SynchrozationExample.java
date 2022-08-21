package com.sreenu.DataStructures.JavaPractice.MultiTherading;

/**
 * Created by SreenUNaik on 01-Mar-21.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class SynchrozationExample {
    protected  Object object = null;

    public synchronized Object getObject() {
        return this.object;
    }

    public synchronized void setObject(Object object) {
        this.object = object;
    }
    public  Object getObj() {
        synchronized (this) {
            return this.object;
        }
    }

    public  void setObj(Object object) {
        synchronized (this) {
            this.object = object;
        }
    }


}
class SynchronizeTest{
    public static void main(String[] args) {
        SynchrozationExample example = new SynchrozationExample();
        Thread thread1 = new Thread(() -> {
        for (int i = 0; i <1000 ; i++) {
                    example.setObject(""+i);
                }
        });
        Thread thread2 = new Thread(()->{
            for (int i = 0; i <1000 ; i++) {
                System.out.println(example.getObject());
            }
        });
        thread1.start();
        thread2.start();
    }
}
