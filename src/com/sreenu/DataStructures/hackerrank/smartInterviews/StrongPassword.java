package com.sreenu.DataStructures.hackerrank.smartInterviews;

/**
 * Created by SreenUNaik on 02-Sep-20.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class StrongPassword {
    static final String SPECIAL_CHARACTERS = "!@#$%^&*()-+";

    static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
        int addNum = 0;
        if (!password.chars().anyMatch(Character::isDigit)) {
            addNum++;
        }
        if (!password.chars().anyMatch(Character::isLowerCase)) {
            addNum++;
        }
        if (!password.chars().anyMatch(Character::isUpperCase)) {
            addNum++;
        }
        if (!password.chars().anyMatch(ch -> SPECIAL_CHARACTERS.indexOf((char) ch) >= 0)) {
            addNum++;
        }
        addNum = Math.max(addNum, 6 - password.length());

        return addNum;

    }

    public static void main(String[] args) {
        System.out.println(minimumNumber(3,"Ab1"));
    }
}
