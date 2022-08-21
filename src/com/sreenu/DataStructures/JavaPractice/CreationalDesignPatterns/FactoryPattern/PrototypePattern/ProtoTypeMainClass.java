package com.sreenu.DataStructures.JavaPractice.CreationalDesignPatterns.FactoryPattern.PrototypePattern;

/**
 * Created by SreenUNaik on 12-Feb-21.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class ProtoTypeMainClass {
    public static void main(String[] args) {
        ProffessionCache.loadProffesiors();
        Proffesion doc = ProffessionCache.getClonedProffesion(1);
        System.out.println(doc);
        Proffesion doc2 = ProffessionCache.getClonedProffesion(2);
        System.out.println(doc2);
        Proffesion doc3 = ProffessionCache.getClonedProffesion(1);
        System.out.println(doc3);
    }
}
