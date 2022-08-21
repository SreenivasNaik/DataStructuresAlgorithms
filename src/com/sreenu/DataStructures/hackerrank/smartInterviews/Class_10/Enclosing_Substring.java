package com.sreenu.DataStructures.hackerrank.smartInterviews.Class_10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by SreenUNaik on 09-Sep-20.
 * Problem : https://www.hackerrank.com/contests/smart-interviews/challenges/si-enclosing-substring
 * Time Complexity :
 * Space Complexity :
 */
public class Enclosing_Substring {
    public static void main(String[] args)  throws  Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int tc = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i <tc ; i++) {
            String inputs []= bufferedReader.readLine().split(" ");
            String a = inputs[0];
            String b = inputs[1];
            int length = enclosingSubStringUsingTwoPointers(b,a);
            bufferedWriter.write(""+length+"\n");
        }
        bufferedWriter.flush();

    }

    private static int enclosingSubStringUsingTwoPointers(String searchString, String t) {
        Map<Character, Integer> requiredCharacters = buildMappingOfCharactersToOccurrences(t);
        Map<Character, Integer> windowCharacterMapping = new HashMap<Character, Integer>();

        int left = 0;
        int right = 0;

        int totalCharFrequenciesToMatch = requiredCharacters.size();
        int charFrequenciesInWindowThatMatch = 0;

        int minWindowLengthSeenSoFar = Integer.MAX_VALUE;
        String minWindow = "";

        while (right < searchString.length()) {
            char characterAtRightPointer = searchString.charAt(right);
            addCharacterToHashtableMapping(windowCharacterMapping, characterAtRightPointer);

            boolean rightCharIsARequirement = requiredCharacters.containsKey(characterAtRightPointer);
            if (rightCharIsARequirement) {
                boolean requirementForCharacterMet = requiredCharacters.get(characterAtRightPointer)
                        .intValue() == windowCharacterMapping.get(characterAtRightPointer).intValue();

                if (requirementForCharacterMet) {
                    charFrequenciesInWindowThatMatch++;
                }
            }

            while (charFrequenciesInWindowThatMatch == totalCharFrequenciesToMatch && left <= right) {
                char characterAtLeftPointer = searchString.charAt(left);
                int windowSize = right - left + 1;

                if (windowSize < minWindowLengthSeenSoFar) {
                    minWindowLengthSeenSoFar = windowSize;
                    minWindow = searchString.substring(left, right + 1);
                }

                windowCharacterMapping.put(characterAtLeftPointer, windowCharacterMapping.get(characterAtLeftPointer) - 1);

                boolean leftCharIsARequirement = requiredCharacters.containsKey(characterAtLeftPointer);
                if (leftCharIsARequirement) {
                    boolean characterFailsRequirement = windowCharacterMapping.get(characterAtLeftPointer)
                            .intValue() < requiredCharacters.get(characterAtLeftPointer).intValue();

                    if (characterFailsRequirement) {
                        charFrequenciesInWindowThatMatch--;
                    }
                }

                left++;
            }

            right++;
        }
    if(minWindow!="")
        return minWindow.length();
        else
            return -1;
    }

    private static Map<Character, Integer> buildMappingOfCharactersToOccurrences(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for (int i = 0; i < s.length(); i++) {
            int occurrencesOfCharacter = map.getOrDefault(s.charAt(i), 0);
            map.put(s.charAt(i), occurrencesOfCharacter + 1);
        }

        return map;
    }

    private static void addCharacterToHashtableMapping(Map<Character, Integer> map, Character c) {
        int occurrences = map.getOrDefault(c, 0);
        map.put(c, occurrences + 1);
    }

}
