package com.sreenu.DataStructures.JavaPractice.CreationalDesignPatterns.FactoryPattern.BuilderPattern;

/**
 * Created by SreenUNaik on 12-Feb-21.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public interface Builder {
    public void buildFloor();
    public void buildWalls();
    public void buildTerras();
    public Home getComplexHomeObj();
}
