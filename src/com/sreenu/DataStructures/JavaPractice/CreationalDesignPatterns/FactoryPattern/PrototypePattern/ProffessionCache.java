package com.sreenu.DataStructures.JavaPractice.CreationalDesignPatterns.FactoryPattern.PrototypePattern;

import java.util.Hashtable;

/**
 * Created by SreenUNaik on 12-Feb-21.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class ProffessionCache {
    private static Hashtable<Integer,Proffesion> proffesionHashtable = new Hashtable<>();
    public  static Proffesion getClonedProffesion(int id){
        Proffesion cached = proffesionHashtable.get(id);
        return (Proffesion)cached.cloneMethod();
    }
    public static  void loadProffesiors(){
        Doctor doctor = new Doctor();
        doctor.id =1;
        proffesionHashtable.put(doctor.id,doctor);
        Teacher teacher = new Teacher();
        teacher.id = 2;
        proffesionHashtable.put(teacher.id,teacher);

    }
}
