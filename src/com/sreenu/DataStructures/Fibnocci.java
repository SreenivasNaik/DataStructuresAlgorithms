package com.sreenu.DataStructures;

/**
 * Created by SreenUNaik on 25-Apr-20.
 */
public class Fibnocci {
    public  static void fib(int number){

        int first =0;
        int count =0;
        int next =1;
        if(number ==1)
            System.out.println(first);
        else if(number <=2)
            System.out.println(first+" "+next);
        else{
            System.out.println(first+" "+next);
            count =2;
            while(count<=number){
                int fib = first+next;
                System.out.println(fib);
                first= next;
                next = fib;
                count++;

            }
        }

    }

    public static void main(String[] args) {
        int num = 5;
        fib(5);
    }

}
