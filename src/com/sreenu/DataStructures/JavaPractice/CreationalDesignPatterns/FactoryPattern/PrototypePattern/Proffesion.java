package com.sreenu.DataStructures.JavaPractice.CreationalDesignPatterns.FactoryPattern.PrototypePattern;

import java.util.Objects;

/**
 * Created by SreenUNaik on 12-Feb-21.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public abstract class Proffesion implements Cloneable {
    public int id;
    public String name;
    abstract  void print();
    public Object cloneMethod(){
        Object clone = null;
        try {
            clone = super.clone();
        }catch (Exception e){
            e.printStackTrace();
        }
        return clone;
    }
}
