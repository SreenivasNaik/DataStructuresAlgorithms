package com.sreenu.DataStructures.JavaPractice.CreationalDesignPatterns.FactoryPattern.SingletonPattern;

/**
 * Created by SreenUNaik on 15-Mar-21.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class SingleTonClonable implements Cloneable {

    private static SingleTonClonable singleTonClonable = null;

    private SingleTonClonable() {
    }

    public static SingleTonClonable getSingleTonClonable() {
        if(singleTonClonable==null){
            singleTonClonable = new SingleTonClonable();
            return singleTonClonable;
        }else {
            return singleTonClonable;
        }
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
       throw new CloneNotSupportedException("You Can't clone Singleton ");
    }
}
