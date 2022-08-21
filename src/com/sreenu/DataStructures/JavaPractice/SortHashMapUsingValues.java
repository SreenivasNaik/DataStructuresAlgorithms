package com.sreenu.DataStructures.JavaPractice;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by SreenUNaik on 06-Feb-21.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class SortHashMapUsingValues {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Apple",100);
        map.put("Mango",300);
        map.put("Gova",100);
        map.put("Banana",500);
        // Sort By Keys
        // Use TreeMap or keep all keys in List and sort it, print it
        TreeMap<String,Integer> sortedMap = new TreeMap<>();
        sortedMap.putAll(map);
        System.out.println(sortedMap);
        // =============================================
        List<Map.Entry<String,Integer>> list = new LinkedList<>(map.entrySet());
        Collections.sort(list,(a1,a2)->{
          //  return a1.getValue().compareTo(a2.getValue()); // Accending order
            return a2.getValue().compareTo(a1.getValue()); // Decending order
        });
        System.out.println(list);
        LinkedHashMap<String,Integer> sortedmapUsingValues = new LinkedHashMap<>();
        list.forEach(entry->{
            sortedmapUsingValues.put(entry.getKey(),entry.getValue());
        });
        System.out.println(sortedmapUsingValues);

        //Using Strams
       LinkedHashMap<String,Integer> sortedmapUsingValuesStram =   map.entrySet().stream().
                sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).
                collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,
                        (oldValue,newValue)->newValue
                        ,LinkedHashMap::new));
        System.out.println(sortedmapUsingValuesStram);

        LinkedHashMap<String,Integer> sortedmapUsingKeysStram =   map.entrySet().stream().
                sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).
                collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,
                        (oldValue,newValue)->newValue
                        ,LinkedHashMap::new));
        System.out.println(sortedmapUsingKeysStram);

        Runtime runtime = Runtime.getRuntime();

    }


}
