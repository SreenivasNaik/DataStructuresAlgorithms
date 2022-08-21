package com.sreenu.DataStructures.JavaPractice;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by SreenUNaik on 03-Mar-21.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 * Java new Operator
 Java Class.newInstance() method
 Java newInstance() method of constructor
 Java Object.clone() method
 */
public class NoOfWaysToCreateObject {
    public String type = "Use";

    public static void main(String[] args) throws IllegalAccessException,
            InstantiationException, NoSuchMethodException, InvocationTargetException,
            CloneNotSupportedException {
        NoOfWaysToCreateObject useNewKeYword = new NoOfWaysToCreateObject();
        System.out.println(useNewKeYword.type);
        NoOfWaysToCreateObject useClassNewInstance = NoOfWaysToCreateObject.class.newInstance();
        System.out.println(useClassNewInstance.type);
        //Java newInstance() method of Constructor class
        Constructor<NoOfWaysToCreateObject> useConstructor = NoOfWaysToCreateObject.class.getConstructor();
        NoOfWaysToCreateObject useConstructorObj = useConstructor.newInstance();
        System.out.println(useConstructorObj.type);
        CloneExample cloneExample = new CloneExample();
        CloneExample cloneExample1 = (CloneExample)cloneExample.clone();
        System.out.println(cloneExample1.name);
    }
    static class CloneExample implements Cloneable{
        protected Object clone() throws CloneNotSupportedException
        {
            return super.clone();
        }
        String name = "Microprocessor";
    }

}
