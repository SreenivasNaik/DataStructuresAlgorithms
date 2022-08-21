package com.sreenu.DataStructures.JavaPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by SreenUNaik on 03-Mar-21.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class Comparator_Using_TwoFields {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person(1,"sreenu",25));
        personList.add(new Person(0,"cnu",21));
        personList.add(new Person(2,"naik",70));
        personList.add(new Person(5,"acr",21));
        personList.add(new Person(3,"avd",25));
        System.out.println(personList);
        System.out.println("==============================");
        Collections.sort(personList,personComparator);
        System.out.println(personList);
    }

    public static Comparator<Person> personComparator = new Comparator<Person>() {
        @Override
        public int compare(Person o1, Person o2) {
            int compareValue = Integer.compare(o1.getAge(),o2.getAge());
            if(compareValue == 0){
                compareValue = o1.getName().compareTo(o2.getName());
            }
            return compareValue;
        }
    };

}
