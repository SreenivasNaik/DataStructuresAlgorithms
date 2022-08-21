package com.sreenu.DataStructures.JavaPractice.StructuralDesignPatterns.ProxyPattern.ProxyPattern;

/**
 * Created by SreenUNaik on 10-Mar-21.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class ProxyClass extends RealSubjectClass {
    @Override
    public void method() {
        System.out.println("Hi I am proxy, will perform authentication");

        System.out.println("Calling Real Mthod");
        super.method();
    }
}
