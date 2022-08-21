package com.sreenu.DataStructures.JavaPractice.StructuralDesignPatterns.ProxyPattern.FlyWeightPattern;

/**
 * Created by SreenUNaik on 10-Mar-21.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class Cat implements Animal {
    String name;
    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void printAnimalAttributes() {
        System.out.println("Name of Animal : "+this.name);
        System.out.println("Number of eyes of Animal : "+CommonSharedClass.eyes);
        System.out.println("Number of noes of Animal : "+CommonSharedClass.nose);
        System.out.println("Number of tail of Animal : "+CommonSharedClass.tail);
        System.out.println("Number of legs of Animal : "+CommonSharedClass.legs);


    }
}
