package com.sreenu.DataStructures.hackerrank.smartInterviews;

/**
 * Created by SreenUNaik on 20-Mar-21.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class StocksBuySellProfit {
    public static void main(String[] args) {
        int arr[] ={3,2,8,9,4};
        System.out.println(getMaxProfit(arr));
    }

    private static int getMaxProfit(int[] arr) {
        int profit = 0;
        int buyingPrice = arr[0];
        for (int i = 1; i <arr.length ; i++) {
            int todayProfit = arr[i] - buyingPrice;
            if (todayProfit<0){
                buyingPrice = arr[i];
            }
            profit = Math.max(todayProfit,profit);
        }
        return profit;
    }
}
