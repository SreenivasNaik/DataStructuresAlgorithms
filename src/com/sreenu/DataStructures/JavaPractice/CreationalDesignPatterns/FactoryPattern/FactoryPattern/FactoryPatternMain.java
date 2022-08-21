package com.sreenu.DataStructures.JavaPractice.CreationalDesignPatterns.FactoryPattern.FactoryPattern;

/**
 * Created by SreenUNaik on 12-Feb-21.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class FactoryPatternMain {
    public static void main(String[] args) {
        ProffesionFactory proffesionFactory = new ProffesionFactory();
        Proffession proffession = proffesionFactory.getProffesion("doctor");
        proffession.printProffesion();
        proffession = proffesionFactory.getProffesion("teacher");
        proffession.printProffesion();
    }
}
