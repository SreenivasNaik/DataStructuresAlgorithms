package com.sreenu.DataStructures.JavaPractice;

import java.io.IOException;

/**
 * Created by SreenUNaik on 23-Mar-21.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class ExceptionInHeritance {
    public static void main(String[] args) {
        ParentWithExceptoin parentWithExceptoin = new ChildWithException();
        parentWithExceptoin.add();

    }

    static class ParentWithNoExceptoin{
       public void add(){
           System.out.println("In parent Add");
        }
    }
    static class ParentWithExceptoin {
        public void add() throws RuntimeException{
            System.out.println("In parent Add");
        }
    }
    static class ChildWithException extends ParentWithExceptoin{
        /*
        * 1) Rule: If the superclass method declares an exception,
         * subclass overridden method can declare same,
          * subclass exception or no exception
          * but cannot declare parent exception.*/
public void add(){
    System.out.println("In child Add");
}
    }
    static class Child extends ParentWithNoExceptoin{

      /*
      ) Rule: If the superclass method does not declare an exception,
       subclass overridden method cannot declare the checked exception.
        public void add() throws IOException {
            System.out.println("In Child Add");
        }*/

      /*
      * 2) Rule: If the superclass method does not declare an exception,
      * subclass overridden method cannot declare the checked exception
      * but can declare unchecked exception.
      * */
        @Override
        public void add() throws ArithmeticException {
            System.out.println("In Child Add");
        }
    }

}
