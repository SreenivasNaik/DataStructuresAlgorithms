package com.sreenu.DataStructures.JavaPractice.Serialization;

import java.io.*;

/**
 * Created by SreenUNaik on 01-Mar-21.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class Serialization_Transient {
    public static void main(String[] args) {
        Address address = new Address("Sreenivas");
        Student student = new Student(1,"Sreenu",25,address);
        try {
            FileOutputStream f  = new FileOutputStream("f.txt");
            ObjectOutputStream out = new ObjectOutputStream(f);
            out.writeObject(student);
            out.flush();
            out.close();
            f.close();
            System.out.println("Moved to File: student"+student+"HashCode::"+student.hashCode());
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("f.txt"));
             student = (Student)in.readObject();
            System.out.println("Student from File"+student+"HashCode::"+student.hashCode());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    static class Student implements Serializable{

        private static final long serialVersionUID = -7915613110361362678L;
        int id;
        String name;
        transient int age;
        // int age;
        private Address address;

        public Student(int id, String name, int age, Address address) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.address = address;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", age=" + age +
                    ", address=" + address +
                    '}';
        }
    }
    static class Address implements Serializable{

        private static final long serialVersionUID = -6413358733410605941L;
        private String addrrss;

        public Address(String addrrss) {
            this.addrrss = addrrss;
        }

        public String getAddrrss() {
            return addrrss;
        }

        public void setAddrrss(String addrrss) {
            this.addrrss = addrrss;
        }
    }

}
