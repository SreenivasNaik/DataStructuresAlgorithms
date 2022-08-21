package com.sreenu.DataStructures.JavaPractice.CreationalDesignPatterns.FactoryPattern.BuilderPattern;

/**
 * Created by SreenUNaik on 12-Feb-21.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class BuilderMainTest {
    public static void main(String[] args) {
        EQResistanceBuilder eqResistanceBuilder = new EQResistanceBuilder();
        Director director = new Director(eqResistanceBuilder);
        director.manageHome();
        System.out.println(director.getHome());
    }
}
