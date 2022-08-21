package com.sreenu.DataStructures;

import java.util.EnumMap;
import java.util.Hashtable;
import java.util.Vector;

/**
 * Created by SreenUNaik on 12-Nov-20.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */

public class Test<T extends Hack1> {

    private T obj;
    public Test(T obj){this.obj = obj;}

    public void getObj() {
         obj.hack1();
    }
}
class Hack1{
    public void hack1(){
        System.out.println("statement 1");
    }
}
class Hack2 extends Hack1{
    public void hack1(){
        System.out.println("statement 2");
    }
}
class Hack3 extends Hack1{
    public void hack1(){
        System.out.println("statement 3");
    }
}
  class  Main{
      public static void main(String[] args) {
         int a[] = new int[]{4,3,2,1};
          Vector<Integer> vector = new Vector<>();
          Hashtable<Integer,String > hashtable = new Hashtable<>();
          vector.addElement(1);
          vector.addElement(2);
          hashtable.put(3,"hi");
          hashtable.put(1,"hiell");
          System.out.println(a[0]);
          System.out.println(vector.elementAt(0));
          System.out.println(hashtable.get(1));
      }
}
