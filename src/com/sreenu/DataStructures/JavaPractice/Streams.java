package com.sreenu.DataStructures.JavaPractice;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by SreenUNaik on 08-Mar-21.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class Streams {

    public static void main(String[] args) {
        List<Integer> numbers  = Arrays.asList(1,3,5,3,10,3,4);

        System.out.println(numbers.stream().filter(i->i>2).collect(Collectors.toSet()));
        System.out.println(numbers.stream().filter(i->i%2!=0).mapToInt(i->i*2).sum());
        Streams streams = new Streams();
        streams.m1(null);
        Map<Employee,String> map = new HashMap<Employee,String>();
        map.put(new Employee(1,30),"Sreenu");
        map.put(new Employee(2,10),"eenu");
        map.put(new Employee(2,25),"enu");
        System.out.println(map);
       map =  map.entrySet().stream().
                filter((k)->
                        k.getKey().age>20)
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(newKey,oldKey)->newKey,
                        LinkedHashMap::new
                        ));
        System.out.println(map);

        List<Employee> employeeList = Arrays.asList(new Employee(1,30,20000,"CSE"),
                new Employee(1,30,10000,"CSE"),
                new Employee(1,30,15000,"ESE"),
                new Employee(1,30,24000,"ESE"));
        System.out.println(employeeList);

      List<Employee> slaray =   employeeList.stream().filter(e->e.salary>10000).map(e-> {
            e.salary = (int) (e.salary+(e.salary * 0.1));
            return  e;

        }).collect(Collectors.toList());
        System.out.println(employeeList.stream().
                collect(
                        Collectors.groupingBy
                                (employee -> employee.department,
                                        Collectors.counting())));
        System.out.println(slaray);


        ///
        Employee employee = new Employee(1,3,2,"cse");
        modifyEmployee(employee);
        System.out.println("modifyEmployee::"+employee);
    }

    private static void modifyEmployee(Employee employee) {
        employee.department = "Naik";
        employee = new Employee(1,2);
        employee.department="cse";
        employee = null;
    }

    public void m1(String m1){
        System.out.println("String m1");
    }

    public void m1(Object m1)
    {
        System.out.println(("Object m1"));
    }

    static class Employee{
        public int id;
        public int age;
        public int salary;
        public String department;

        public Employee(int id, int age, int salary, String department) {
            this.id = id;
            this.age = age;
            this.salary = salary;
            this.department = department;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", age=" + age +
                    ", salary=" + salary +
                    ", department='" + department + '\'' +
                    '}';
        }

        public Employee(int id, int age) {
            this.id = id;
            this.age = age;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Employee)) return false;

            Employee employee = (Employee) o;

            if (id != employee.id) return false;
            return age == employee.age;
        }

        @Override
        public int hashCode() {
            int result = id;
            result = 31 * result + age;
            return result;
        }
    }
}
