package com.sreenu.DataStructures.JavaPractice.CreationalDesignPatterns.FactoryPattern.AbstractFactoryPattern;

/**
 * Created by SreenUNaik on 12-Feb-21.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class AbstractFactoryMain {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = AbstractFactoryProducer.getProffesion(true);
        Proffession proffession = abstractFactory.getProffesion("teacher");
        proffession.printProffesion();
    }
}
