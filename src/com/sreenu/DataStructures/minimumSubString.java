package com.sreenu.DataStructures;

/**
 * Created by SreenUNaik on 19-Apr-20.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/**/

class Result {

    /*
     * Complete the 'fewestCoins' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING coins as parameter.
     */

    public static int fewestCoins(String coins) {
        HashSet<Character> unique = new HashSet<>();
        String result ="";
        for(int i=0;i<coins.length();i++){
            unique.add(coins.charAt(i));
        }
        int start =0;
        int end =0;
        int uniqueConter =0;
        int patLen = unique.size();
        char headChar;
        Map<Character,Integer> map = new HashMap<>();
        Iterator<Character> cr = unique.iterator();
        while(cr.hasNext()){
            map.put(cr.next(),0);
        }
        System.out.println("map"+map);
        for(int i=start;i<coins.length();i++){
            char c=coins.charAt(i);
            if(!map.containsKey(c))
                continue;
            int charCount = map.get(c);
            if(charCount ==0)
                uniqueConter++;
            map.put(c,map.get(c)+1);

            while(uniqueConter == patLen ){
                int tempLength = i-start+1;
                if(tempLength == patLen){
                    System.out.println("temp==="+coins.substring(start,i+1));
                    return coins.substring(start,i+1).length();

                }
                if(result =="" || tempLength<result.length()){
                    result = coins.substring(start,i+1);
                }
                headChar = coins.charAt(start);
                if(map.containsKey(headChar)){
                    int headCount = map.get(headChar)-1;
                    if(headCount ==0)
                        uniqueConter--;
                    map.put(headChar, headCount);
                }
                start++;

            }

        }
        System.out.println("Result::"+result);
        return result.length();
    }

}

public class minimumSubString {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
     //   BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String coins = bufferedReader.readLine();

        int result = Result.fewestCoins(coins);

        System.out.println("Resut"+result);
        bufferedReader.close();

    }
}
