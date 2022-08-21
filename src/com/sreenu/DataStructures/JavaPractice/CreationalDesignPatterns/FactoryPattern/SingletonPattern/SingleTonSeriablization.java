package com.sreenu.DataStructures.JavaPractice.CreationalDesignPatterns.FactoryPattern.SingletonPattern;

import java.io.*;

/**
 * Created by SreenUNaik on 15-Mar-21.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class SingleTonSeriablization {
    public static void main(String[] args) {
        Singleton singleton = Singleton.INSTANCE;
       // singleton.setValue(1);

        // Serialize the singleton with value = 1
        try {
            FileOutputStream fileOut = new FileOutputStream("out.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(singleton);
            out.close();
            fileOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //singleton.setValue(2); // Change the value of the singleton in memory to 2

        // Deserialize the serialized singleton with value 1
        Singleton singleton2 = null;
        try {
            FileInputStream fileIn = new FileInputStream("out.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            singleton2 = (Singleton) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            System.out.println("singletons.SingletonEnum class not found");
            c.printStackTrace();
        }
        System.out.println(singleton);
        System.out.println(singleton2);
        if (singleton == singleton2) {
            System.out.println("Two objects are same");
        } else {
            System.out.println("Two objects are not same");
        }


    }
    static class Singleton implements Serializable{
        public static final Singleton INSTANCE = new Singleton();

        private Singleton() {
        }
        /*
        * readResolve is used for replacing the object read from the stream.
        * The only use I've ever seen for this is enforcing singletons;
        * when an object is read, replace it with the singleton instance.
         * This ensures that nobody can create another instance by
         * serializing and deserializing the singleton.
        * */
        protected Object readResolve() {
            return INSTANCE;
        }

    }
}
