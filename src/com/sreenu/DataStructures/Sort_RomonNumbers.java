package com.sreenu.DataStructures;

import java.util.HashMap;
import java.util.TreeMap;

/**
 * Created by SreenUNaik on 29-Sep-18.
 */
public class Sort_RomonNumbers {
    private final static TreeMap<Integer, String> map = new TreeMap<Integer, String>();

    static {

        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");

    }
    public final static String toRoman(int number) {
        int l =  map.floorKey(number);
        if ( number == l ) {
            return map.get(number);
        }
        return map.get(l) + toRoman(number-l);
    }

    public static void main(String[] args) {
        /*String romanString = "I,L,M,X,XLVII,XII,V,IV,XXXVII,LXXV,XL";
        HashMap<String,Integer> values = new HashMap<>();
        values.put("I",1);values.put("V",5);values.put("X",10);values.put("L",50);values.put("M",100);
        String[] arr = romanString.split(",");
        TreeMap<Integer,String> sortedRoman = new TreeMap<>();
        for(int i=0;i<arr.length;i++){
            String present = arr[i];
            int length = present.length();
            if(length == 1){
                System.out.println(present+"::"+values.get(present));
                sortedRoman.put(values.get(present),present);
            }
            else{
                if(present.startsWith("I")){
                    int value = 0;int leftTotal = 0;
                    for(int j =0;j<present.length();j++){
                        char c = present.charAt(j);
                        if(j != present.length()-1 ){
                            leftTotal+=values.get(Character.toString(c));
                        }
                        else{
                            value = values.get(Character.toString(c));
                        }
                    }
                    System.out.println("Value ::"+value+" remove :"+leftTotal);
                    value = value - leftTotal;
                    System.out.println(present+"::"+value);
                    sortedRoman.put(value,present);
                }
                else{
                    int value = 0;int rightTotal = 0;
                    for(int j =0;j<present.length();j++){
                        char c = present.charAt(j);

                        if(j==1){
                            value = values.get(Character.toString(c));
                        }
                        else{
                            rightTotal+=values.get(Character.toString(c));
                        }
                    }
                    System.out.println("Value ::"+value+" add :"+rightTotal);
                    value = value + rightTotal;
                    System.out.println(present+"::"+value);
                    sortedRoman.put(value,present);
                }
            }
        }
        System.out.println(sortedRoman);*/

            System.out.println(Sort_RomonNumbers.toRoman(45));

    }
}
