package com.sreenu.DataStructures.hackerrank.smartInterviews.Class_9;

/**
 * Created by SreenUNaik on 30-Aug-20.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class Count_No_Of_Non_Decreasing_SubSequences {
    public static void main(String[] args) {
        int a[] = new int[]{3,8,-1,10,4,-7,10,8,15};
        System.out.println(countNoOfNonDecreasingSubSequenceInterative(a,a.length));
        System.out.println(countNoOfNonDecreasingSubSequenceRecursive(a,a.length,0,Integer.MIN_VALUE));
    }

    private static int countNoOfNonDecreasingSubSequenceInterative(int[] a, int length) {
        int c=0;
        int pow = 1<<length;
        for (int i = 0; i <pow ; i++) {
            if(check(a,length,i))
                c++;
        }
        return c;
    }
    private static int countNoOfNonDecreasingSubSequenceRecursive(int[] a, int length,int index,int prev) {
        if(index == length)
          return 1;
        return countNoOfNonDecreasingSubSequenceRecursive(a,length,index+1,prev)+(prev<=a[index]?countNoOfNonDecreasingSubSequenceRecursive(a,length,index+1,a[index]):0);
    }
    private static boolean check(int[] a, int length, int i) {
        int prev = Integer.MIN_VALUE;
        for (int j = 0; j <length ; j++) {
            if(checkBit(i,j)){
                if (a[j]<prev){
                    return false;
                }
                prev=a[j];
            }
        }
        return true;
    }

    private static boolean checkBit(int i, int j) {
        return ((i>>j)&1 )!=0;
    }


}
