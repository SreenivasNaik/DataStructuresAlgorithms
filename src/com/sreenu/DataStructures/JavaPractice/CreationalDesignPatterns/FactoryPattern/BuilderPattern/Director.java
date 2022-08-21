package com.sreenu.DataStructures.JavaPractice.CreationalDesignPatterns.FactoryPattern.BuilderPattern;

/**
 * Created by SreenUNaik on 12-Feb-21.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }
    public Home getHome(){
    return     this.builder.getComplexHomeObj();
    }
    public  void manageHome(){
        this.builder.buildFloor();
        this.builder.buildTerras();
        this.builder.buildWalls();
    }

}
