package com.sreenu.DataStructures.JavaPractice.StructuralDesignPatterns.ProxyPattern.FlyWeightPattern;

import java.util.HashMap;

/**
 * Created by SreenUNaik on 10-Mar-21.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class AnimalFactory {
    public static final HashMap<String,Animal> animalMap = new HashMap<>();

    public static Animal getAnimal(String name){
        Animal animal = animalMap.get(name);
        if (animal!=null){
            return animal;
        }else{
            if(name.equalsIgnoreCase("CAT")){
                animal = new Cat();
                animal.setName("CAT");
                animalMap.put("CAT",animal);
            }else if(name.equalsIgnoreCase("DOG")){
                animal = new Dog();
                animal.setName("DOG");
                animalMap.put("DOG",animal);
            }
            return animal;
        }

    }
}
