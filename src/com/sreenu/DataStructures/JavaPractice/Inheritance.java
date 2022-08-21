package com.sreenu.DataStructures.JavaPractice;

import java.util.Arrays;

/**
 * Created by SreenUNaik on 16-Mar-21.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class Inheritance {

    static class Parent{
        protected void foo() {
            System.out.println("ss");
        }
        public int getInterger(int x){
            return x;
        }
    }
    static class Child extends  Parent{
        public void foo() {
            System.out.println("derived");
        }
        public int getInterger(int x) {
            return x;
        }
    }
   static class Point {
        protected int x, y;

        public Point(int _x, int _y)
        {
            x = _x;
            y = _y;
        }

       public Point() {
       }
   }

   static public class Main {
        public static void main(String args[])
        {
            Point p = new Point();
            System.out.println("x = " + p.x + ", y = " + p.y);
        }
    }


    static class Complex {
        private double re, im;
        public String toString() {
            return "(" + re + " + " + im + "i)";
        }
        Complex(Complex c) {
            re = c.re;
            im = c.im;
        }

        public Complex() {
        }
    }

    static public class Main1 {
        public static void main(String[] args) {
            Complex c1 = new Complex();
            Complex c2 = new Complex(c1);
            System.out.println(c2);
        }
    }

}

