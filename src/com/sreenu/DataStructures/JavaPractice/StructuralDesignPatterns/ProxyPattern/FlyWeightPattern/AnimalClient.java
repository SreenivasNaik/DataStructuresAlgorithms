package com.sreenu.DataStructures.JavaPractice.StructuralDesignPatterns.ProxyPattern.FlyWeightPattern;

/**
 * Created by SreenUNaik on 10-Mar-21.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class AnimalClient {
    public static void main(String[] args) {
        Animal cat = AnimalFactory.getAnimal("CAT");
        cat.printAnimalAttributes();
        Animal cat1 = AnimalFactory.getAnimal("CAT");
        cat1.printAnimalAttributes();
        Animal dog = AnimalFactory.getAnimal("DOG");
        dog.printAnimalAttributes();
        Animal dog1 = AnimalFactory.getAnimal("DOG");
        dog1.printAnimalAttributes();

        System.out.println("HashCodes::Cat"+cat.hashCode()+"::Cat1::"+cat1.hashCode());
        System.out.println("HashCodes::Dog"+dog.hashCode()+"::Dog1::"+dog1.hashCode());
    }
}
