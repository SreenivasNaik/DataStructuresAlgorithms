package com.sreenu.DataStructures;

import java.util.Scanner;

public class Hk1 {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        double pos =0;
        double neg =0;
        double zero =0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0){
                zero++;
            }else if(arr[i]>0){
                pos++;
            }else{
                neg++;
            }
        }
        int len = arr.length;
        System.out.println("len"+len);
        System.out.println("pos"+pos);
        System.out.println("neg"+neg);
        System.out.println("zero"+zero);
        System.out.println(pos/len);
        System.out.println(neg/len);
        System.out.println(zero/len);


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();


        int[] arr = new int[n];


        for (int i = 0; i < n; i++) {
            int arrItem = scanner.nextInt();
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
