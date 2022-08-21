package com.sreenu.DataStructures.JavaPractice.StructuralDesignPatterns.ProxyPattern.ProxyPattern;

/**
 * Created by SreenUNaik on 10-Mar-21.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class RealSubjectClass  implements  Subject{

    @Override
    public void method() {
        System.out.println("I am the Actual implemenation of Subject Remaining are proxies");
    }
}
