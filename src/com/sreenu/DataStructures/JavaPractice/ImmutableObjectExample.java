package com.sreenu.DataStructures.JavaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by SreenUNaik on 12-Mar-21.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class ImmutableObjectExample {
    public static void main(String[] args) {
        ImmutableEmployeeObject immutableEmployeeObject = new ImmutableEmployeeObject(
                "Sreenu",1, Arrays.asList("Java"));
        System.out.println(immutableEmployeeObject);
    }
}
 class ImmutableEmployeeObject{
    private final String name;
    private final Integer id;
    private final List<String> skils;

    @Override
    public String toString() {
        return "ImmutableEmployeeObject{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", skils=" + skils +
                '}';
    }

    public ImmutableEmployeeObject(String name, Integer id, List<String> skils) {
        this.name = name;
        this.id = id;
        this.skils = skils;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public List<String> getSkils() {
        return new ArrayList<>(skils);
    }
}
