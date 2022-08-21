package com.sreenu.DataStructures.hackerrank.smartInterviews;

import java.util.Arrays;

/**
 * Created by SreenUNaik on 22-Mar-21.
 * Problem :https://www.geeksforgeeks.org/minimum-number-platforms-required-railwaybus-station/
 * Given arrival and departure times of all trains that reach a railway station,
 * the task is to find the minimum number of platforms required for the railway station
 * so that no train waits.
 We are given two arrays which represent arrival and departure times of trains that stop
 Input: arr[] = {9:00, 9:40, 9:50, 11:00, 15:00, 18:00}
 dep[] = {9:10, 12:00, 11:20, 11:30, 19:00, 20:00}
 Output: 3
 * Time Complexity :
 * Space Complexity :
 */
public class MinimumNumberOfPlatformsRequiredFor_Railway_BusStation {
    public static void main(String[] args) {
        int arr[] = { 900, 940, 950, 1100, 1500, 1800 };
        int dep[] = { 910, 1200, 1120, 1130, 1900, 2000 };
        int n = 6;
        System.out.println(
                "Minimum Number of Platforms Required = "
                        + findPlatform(arr, dep, n));
        System.out.println(
                "Minimum Number of Platforms Required = "
                        + findPlatfromUsingTwoPointers(arr, dep, n));
    }

    private static int findPlatform(int[] arr, int[] dep, int n) {
        int platfromsNeeded = 1 ,result =1;
        int i =1,j=0;
        for ( i = 0; i < n; i++) {
            platfromsNeeded =1;
            for (j =i+1; j < n; j++) {
                if((arr[i]>= arr[j] && arr[i]<=dep[j])
                    || (arr[j]>= arr[i] && arr[j]<=dep[i])
                        ){
                    platfromsNeeded++;
                }
                result = Math.max(result,platfromsNeeded);
            }

        }
        return result;
    }

    static int findPlatfromUsingTwoPointers(int arr[],int dep[],int n){
        Arrays.sort(arr);
        Arrays.sort(dep);
        int platFormNeeded =1,result =1 , i =1,j=0;
        while (i<n && j<n){
            if(arr[i]<= dep[j]){
                platFormNeeded++;
                i++;
            }
            else if(arr[i]>dep[j]){
                platFormNeeded--;
                j++;
            }
            result = Math.max(result,platFormNeeded);
        }
        return result;
    }
}
