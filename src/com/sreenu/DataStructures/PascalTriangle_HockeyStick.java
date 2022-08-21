package com.sreenu.DataStructures;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by SreenUNaik on 28-Sep-18.
 */
public class PascalTriangle_HockeyStick {
    static HashMap<Long,BigInteger> factMap = new HashMap<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long lineNumber = scanner.nextLong();
        long length = scanner.nextLong();
        BigInteger lineNumberFact = factMap.get(lineNumber) != null ? factMap.get(lineNumber): factorial(lineNumber);
        for(long i = lineNumber;i<lineNumber+length;i++){
            BigInteger factI;
            if(factMap.get(i)!=null){
                factI = factMap.get(i);
            }
            else{
                if(factMap.get(i-1)!=null){
                    factI = factMap.get(i-1).multiply(BigInteger.valueOf(i));
                    factMap.put(i,factI);
                }
                else{
                    factI = factorial(i);
                }
            }
            BigInteger fact ;
            if(factMap.get(i-lineNumber)!=null){
                fact = factMap.get(i-lineNumber);
            }
            else{
                if(factMap.get((i-lineNumber)-1)!=null){
                    fact = factMap.get((i-lineNumber)-1).multiply(BigInteger.valueOf(i-lineNumber));
                    factMap.put(i-lineNumber,fact);
                }
                else{
                    fact = factorial(i-lineNumber);
                }
            }
            System.out.print(factI.divide(lineNumberFact.multiply(fact))+" ");
        }

    }
    static BigInteger factorial(long number){

        BigInteger fact = BigInteger.ONE;
        for(long i = number;i >0; i--){
            fact = fact.multiply(BigInteger.valueOf(i));
           //System.out.println(i);
        }
       factMap.put(number,fact);
        //System.out.println("Number"+number+"fact"+fact);

        return fact;
    }

}
