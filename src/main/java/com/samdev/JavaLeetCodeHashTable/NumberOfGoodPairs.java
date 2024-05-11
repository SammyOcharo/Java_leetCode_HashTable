package com.samdev.JavaLeetCodeHashTable;

import java.util.HashMap;
import java.util.Map;

public class NumberOfGoodPairs {
    //Given an array of integers nums, return the number of good pairs.
    //
    //A pair (i, j) is called good if nums[i] == nums[j] and i < j.
    //Example 1:
    //
    //Input: nums = [1,2,3,1,1,3]
    //Output: 4
    //Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
    //Example 2:
    //
    //Input: nums = [1,1,1,1]
    //Output: 6
    //Explanation: Each pair in the array are good.
    //Example 3:
    //
    //Input: nums = [1,2,3]
    //Output: 0

    public static int numIdenticalPairs(int[] arrNumbers){
        Map<Integer, Integer> identicalCounts = new HashMap<>();
        int goodPairs = 0;

        for(int i=0; i < arrNumbers.length; i++){
            identicalCounts.put(arrNumbers[i], identicalCounts.getOrDefault(arrNumbers[i], 0) + 1);
            int count = identicalCounts.get(arrNumbers[i]);
            goodPairs += count - 1;
        }
        return goodPairs;
    }

}
