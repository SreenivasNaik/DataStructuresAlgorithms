package com.sreenu.DataStructures.JavaPractice;

/**
 * Created by SreenUNaik on 12-Mar-21.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public final class ImmutableSingletonClass {
    private static final ImmutableSingletonClass instance = new ImmutableSingletonClass();

    //Make the constructor private so that this class cannot be instantiated
    private ImmutableSingletonClass() {}

    //Get the only object available
    public static ImmutableSingletonClass getInstance() {
        return instance;
    }
//  Locking /Lazy loading with Double checked Locking
// private static volatile Singleton instance;
//
//    private Singleton() {}
//
//    public static Singleton getInstance() {
//        if(instance == null) {
//            synchronized(Singleton.class) {
//                //double checking Singleton instance
//                if(instance == null) {
//                    instance = new Singleton();
//                }
//            }
//        }
//        return instance;
//    }
}
