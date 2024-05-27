package com.samdev.JavaLeetCodeHashMap;

import java.util.*;

public class SortPeople {
    //You are given an array of strings names, and an array heights that consists of distinct positive integers. Both arrays are of length n.
    //
    //For each index i, names[i] and heights[i] denote the name and height of the ith person.
    //
    //Return names sorted in descending order by the people's heights.

    //Example 1:
    //
    //Input: names = ["Mary","John","Emma"], heights = [180,165,170]
    //Output: ["Mary","Emma","John"]
    //Explanation: Mary is the tallest, followed by Emma and John.
    //Example 2:
    //
    //Input: names = ["Alice","Bob","Bob"], heights = [155,185,150]
    //Output: ["Bob","Alice","Bob"]
    //Explanation: The first Bob is the tallest, followed by Alice and the second Bob.

    public static String[] sortPeople(String[] names, int[] heights){
        Map<Integer, String> mappedHeights = new TreeMap<>(Collections.reverseOrder());

        for(int i=0; i < heights.length; i++){
            mappedHeights.put(heights[i],names[i]);
        }
        System.out.println(mappedHeights);
        int index=0;

        String [] sortedStrings = new String[mappedHeights.size()];
        for(String value: mappedHeights.values()){
            sortedStrings[index] = value;
            index++;
        }

        return sortedStrings;
    }

    public static void main(String[] args){

        String [] names = {"Alice","Bob","Bob"};
        int [] heights = {155,185,150};
        System.out.println(Arrays.toString(SortPeople.sortPeople(names, heights)));
    }

}
