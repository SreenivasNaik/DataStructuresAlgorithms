package com.sreenu.DataStructures.JavaPractice.CreationalDesignPatterns.FactoryPattern.AbstractFactoryPattern;

/**
 * Created by SreenUNaik on 12-Feb-21.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class AbstractFactoryProducer {
    public  static AbstractFactory getProffesion(boolean isTrainee){
        if (isTrainee)
            return new TrainyProffesionFactory();
        else
            return new ProffesionFactory();
    }
}
