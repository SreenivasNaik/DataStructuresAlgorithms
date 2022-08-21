package com.sreenu.DataStructures.JavaPractice;

/**
 * Created by SreenUNaik on 12-Mar-21.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class ExtendsExamples {
    public static void main(String[] args) {
        new B();
    }
    static class A{
        public A(){
            greating();
            printf();
        }
        void greating(){
            System.out.println("In A - greating");
        }
        static void printf(){
            System.out.println("In A - Printf");
        }
    }
    static class B{
        public B(){
            greating();
            printf();
        }
        void greating(){
            System.out.println("In B - greating");
        }
        static void printf(){
            System.out.println("In B - Printf");
        }
    }
}
