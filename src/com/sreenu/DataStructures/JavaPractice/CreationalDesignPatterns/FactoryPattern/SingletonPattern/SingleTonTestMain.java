package com.sreenu.DataStructures.JavaPractice.CreationalDesignPatterns.FactoryPattern.SingletonPattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by SreenUNaik on 12-Feb-21.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class SingleTonTestMain {
    public static void main(String[] args) throws CloneNotSupportedException, IllegalAccessException, InvocationTargetException, InstantiationException {
//        SingletonClass singletonClass = SingletonClass.getSingletonClass();
//singletonClass.SimpleMethod();
//SingletonClass singletonClass1 = SingletonClass.getSingletonClass();
//singletonClass1.SimpleMethod();

        SingleTonClonable singleTonClonable = SingleTonClonable.getSingleTonClonable();
        //SingleTonClonable singleTonClonable1 = (SingleTonClonable) singleTonClonable.clone();
        System.out.println(singleTonClonable);
        //System.out.println(singleTonClonable1);
        SingleTonClonable singleTonClonable1 = null;
        Constructor<?>[] constuctor = SingleTonClonable.class.getDeclaredConstructors();
        for (Constructor<?> con:constuctor
             ) {
            con.setAccessible(true);
            Object obj = con.newInstance();
            singleTonClonable1 = (SingleTonClonable)obj;
            break;
        }
        System.out.println(singleTonClonable1.hashCode());

        SingletonEnum singletonEnum = SingletonEnum.GETINSTANCE;
        SingletonEnum singletonEnum1 = SingletonEnum.GETINSTANCE;
        System.out.println(singletonEnum.hashCode());
        System.out.println(singletonEnum1.hashCode());

    }
}
