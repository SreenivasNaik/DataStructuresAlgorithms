package com.sreenu.DataStructures.JavaPractice.Serialization;

import java.io.*;

/**
 * Created by SreenUNaik on 01-Mar-21.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class Serialization_UsingExternalizableInterface {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String filename = "employee.txt";
        seriablizeObj(filename);
        DeseriablizeObj(filename);

    }
    public static void seriablizeObj(String fileName) throws IOException {
        Employee employee = new Employee("Sreenu",25,"naika@gm","a1sd");
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(fileName)))){
            oos.writeObject(employee);
            System.out.println("EMployee Seriablization done=============");
        }

    }
    public static void DeseriablizeObj(String fileName) throws IOException, ClassNotFoundException {
      //  Employee employee = new Employee("Sreenu",25,"naika@gm","a1sd");
        try(ObjectInputStream oos = new ObjectInputStream(new FileInputStream(new File(fileName)))){
            Employee employee1 = (Employee) oos.readObject();

            System.out.println("EMployee DeseriablizeObj done:: "+employee1.toString());
            System.out.println("From Super class Name ::"+employee1.getName()+":Age:"+employee1.getAge());
        }

    }
    static class Person{
        private String name;
        private int age;

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

        public Person() {
        }

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
    static class Employee extends Person implements Externalizable{

        private static final long serialVersionUID = -8598571267444038272L;
        private String email;
        private String password;

        public Employee() {
            System.out.println("In Default COnstutoer of Employee");
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "email='" + email + '\'' +
                    ", password='" + password + '\'' +
                    '}';
        }

        public Employee(String name, int age, String email, String password) {
            super(name, age);
            this.email = email;
            this.password = password;
        }

        public static long getSerialVersionUID() {
            return serialVersionUID;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeInt(getAge());
            objectOutputStream.writeObject(getName());

        }
        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            setAge(objectInputStream.readInt());
            setName((String)objectInputStream.readObject());
        }

        @Override
        public void writeExternal(ObjectOutput out) throws IOException {
           // parent
            out.writeInt(getAge());
           out.writeObject(getName());
           //childern
            out.writeObject(getEmail());
            out.writeObject(getPassword());
        }

        @Override
        public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        // parent
            setAge(in.readInt());
        setName((String)in.readObject());
        // childern
        setEmail((String)in.readObject());
        setPassword((String)in.readObject());
        }
    }
}
