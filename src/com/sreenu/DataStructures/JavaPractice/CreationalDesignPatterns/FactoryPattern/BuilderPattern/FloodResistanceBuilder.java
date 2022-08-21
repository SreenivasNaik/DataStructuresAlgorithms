package com.sreenu.DataStructures.JavaPractice.CreationalDesignPatterns.FactoryPattern.BuilderPattern;

/**
 * Created by SreenUNaik on 12-Feb-21.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class FloodResistanceBuilder implements Builder {
    private Home floodResistedHome = new Home();
    @Override
    public void buildFloor() {
        this.floodResistedHome.floor = "concet floor";

    }

    @Override
    public void buildWalls() {
    this.floodResistedHome.wall = "concet wall";
    }

    @Override
    public void buildTerras() {
this.floodResistedHome.terrace = "comcet terrace";
    }

    @Override
    public Home getComplexHomeObj() {
        return this.floodResistedHome;
    }
}
