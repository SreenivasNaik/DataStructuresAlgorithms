package com.sreenu.DataStructures.JavaPractice.CreationalDesignPatterns.FactoryPattern.SingletonPattern;

/**
 * Created by SreenUNaik on 12-Feb-21.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class SingletonClass {
    private  static SingletonClass singletonClass = new SingletonClass();
    private SingletonClass(){}

    public static SingletonClass getSingletonClass() {
        return singletonClass;
    }
    public void SimpleMethod(){
        System.out.println("In SIngleton class method"+singletonClass);
    }
}
