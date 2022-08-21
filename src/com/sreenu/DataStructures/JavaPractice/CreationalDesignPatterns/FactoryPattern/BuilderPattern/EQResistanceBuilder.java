package com.sreenu.DataStructures.JavaPractice.CreationalDesignPatterns.FactoryPattern.BuilderPattern;

/**
 * Created by SreenUNaik on 12-Feb-21.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class EQResistanceBuilder implements Builder {
    private Home eqResistedHome = new Home();
    @Override
    public void buildFloor() {
        this.eqResistedHome.floor = "wood floor";

    }

    @Override
    public void buildWalls() {
    this.eqResistedHome.wall = "wood wall";
    }

    @Override
    public void buildTerras() {
this.eqResistedHome.terrace = "wood terrace";
    }

    @Override
    public Home getComplexHomeObj() {
        return this.eqResistedHome;
    }
}
