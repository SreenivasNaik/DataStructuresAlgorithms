package com.sreenu.DataStructures;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by SreenUNaik on 10-Mar-21.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 *
 Given a time represented in the format "HH:MM",
 form the next closest time by reusing the current digits.
 There is no limit on how many times a digit can be reused.
 You may assume the given input string is always valid.
 For example, "01:34", "12:09" are all valid. "1:34", "12:9" are all invalid.
 Example 1:
 Input: "19:34"
 Output: "19:39"
 Explanation: The next closest time choosing from digits 1, 9, 3, 4, is 19:39, which occurs 5 minutes later.
 It is not 19:33, because this occurs 23 hours and 59 minutes later.
 Example 2:
 Input: "23:59"
 Output: "22:22"
 Explanation: The next closest time choosing from digits 2, 3, 5, 9, is 22:22.
 It may be assumed that the returned time is next day's time since it is smaller than the input time numerically.
 */
public class NextClosestTime {
    public static void main(String[] args) {
        NextClosestTime closestTime = new NextClosestTime();
        System.out.println(closestTime.nextClosestTime("23:59"));
    }
    public String nextClosestTime(String time) {
        String[] val = time.split(":");
        Set<Integer> set = new HashSet<>();
        int hour = add(set, val[0]);
        int minu = add(set, val[1]);

        int[] times = new int[] {hour, minu};
        nxt(times);

        while (!contains(times[0], times[1], set)) {
            nxt(times);
        }
        return valid(times[0]) + ":" + valid(times[1]);
    }

    public void nxt(int[] time) {
        int hour = time[0];
        int minu = time[1];
        minu ++;
        if (minu == 60) {
            hour ++;
            minu = 0;
            if (hour == 24) hour = 0;
        }
        time[0] = hour;
        time[1] = minu;
    }

    public int add(Set<Integer> set, String timeStr) {
        int time = Integer.parseInt(timeStr);
        set.add(time / 10);
        set.add(time % 10);
        return time;
    }

    public String valid(int time) {
        if (time >= 0 && time <= 9) return "0" + time;
        else return time + "";
    }

    public boolean contains(int hour, int minu, Set<Integer> set) {
        return set.contains(hour / 10) && set.contains(hour % 10) && set.contains(minu / 10) && set.contains(minu % 10);
    }

}
