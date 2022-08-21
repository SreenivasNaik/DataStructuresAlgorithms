package com.sreenu.DataStructures.JavaPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by SreenUNaik on 12-Feb-21.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class ComparableTest {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person(1,"sreenu",25));
        personList.add(new Person(0,"cnu",21));
        personList.add(new Person(2,"naik",70));
   //     Collections.sort(personList);
        System.out.println(personList);
        Collections.sort(personList,(a1,a2)->{
            return a1.getName().compareTo(a2.getName());
        });
        System.out.println(personList);
        Collections.sort(personList,(a1,a2)->{
            if (a1.getAge()>a2.getAge())
                return 1;
            else if(a1.getAge()==a2.getAge())
                return 0;
            return -1;
        });
        System.out.println(personList);
    }
}
