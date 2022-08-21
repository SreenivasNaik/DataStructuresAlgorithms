package com.sreenu.DataStructures.JavaPractice.CreationalDesignPatterns.FactoryPattern.AbstractFactoryPattern;

/**
 * Created by SreenUNaik on 12-Feb-21.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class ProffesionFactory extends AbstractFactory {
    public Proffession getProffesion(String proffesion){
        if(proffesion == null)
            return null;
        if (proffesion.equalsIgnoreCase("doctor"))
            return new Doctor();
        else if(proffesion.equalsIgnoreCase("teacher"))
            return new Teacher();
        return null;
    }
}
