package com.company;

import sun.lwawt.macosx.CSystemTray;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //firstBadVersion(5);
//        int A[] = { 1, -4, 45, 6, 10, 8 };
//        int n = -3;
//        twoSum(A, n);
        System.out.println(">>>" + lengthOfLongestSubstring("pwwkew"));
    }

//    public static int firstBadVersion(int n) {
//        int left = 0, right = n, answer = 0;
//        int mid = 0;
//        while (left <= right) {
//            mid = left + (right - left) / 2;
//            if (isBadVersion(mid)) {
//                answer = mid;
//                right = mid - 1;
//            } else {
//                left = mid + 1;
//            }
//        }
//        return answer;
//    }

    public static void twoSum(int[] nums, int target) {
        HashSet<Integer> numSet = new HashSet<Integer>();
        for(int i=0; i<nums.length;i++) {
            int temp = target - nums[i];
            if(numSet.contains(temp)) {
                System.out.println(nums[i] + "-" + temp);
            }
            numSet.add(nums[i]);
        }

    }

    public static int lengthOfLongestSubstring(String s) {
        int longestLength =0;
        String longestString = null;
        char[] charArray = s.toCharArray();
        Map<Character,Integer> charMap = new HashMap<>();
        for(int i=0; i< charArray.length; i++){
            char ch = charArray[i];
            if(!charMap.containsKey(ch)){
                charMap.put(ch,i);
            } else {
                i = charMap.get(ch);
                charMap.clear();
            }
            if(charMap.size() > longestLength) {
                longestLength = charMap.size();
                longestString = charMap.keySet().toString();
            }

        }
        return longestLength;
    }

    public int reverse(int x) {

        String reversed = new StringBuilder().append(Math.abs(x)).reverse().toString();

        try {
            return (x<0)?Integer.parseInt(reversed)* -1 : Integer.parseInt(reversed);
        } catch(NumberFormatException e) {
            return 0;
        }

    }

}
