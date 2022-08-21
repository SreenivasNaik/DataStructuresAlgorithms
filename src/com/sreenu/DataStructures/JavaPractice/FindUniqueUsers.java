package com.sreenu.DataStructures.JavaPractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by SreenUNaik on 18-Mar-21.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class FindUniqueUsers {
    public static void main(String[] args) {
        List<User> userList  = Arrays.asList(new User(1,1),
        new User(1,1),
        new User(2,2),
                new User(3,3));
        System.out.println(userList);
        Set<User> userSet = new HashSet<>();
        for(User user:userList){
            System.out.println("User added:"+userSet.add(user));

        }
        System.out.println(userSet);
    }
    static class User{
        int id;
        int age;

        public User(int id, int age) {
            this.id = id;
            this.age = age;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof User)) return false;

            User user = (User) o;

            if (getId() != user.getId()) return false;
            return getAge() == user.getAge();
        }

        @Override
        public int hashCode() {
          return 1;
        }

        @Override
        public String toString() {
            return "User{" +
                    "id=" + id +
                    ", age=" + age +
                    '}';
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
