package com.samdev.JavaLeetCodeHashMap;

import java.util.HashMap;
import java.util.Map;

public class mergeMethodHashMap {
    //this HashMap method merge(K key, V value, BiFunction) takes in key, value and a bifunction. It uses the BiFunction
    // to combine given values for a specific key.

    public static void main(String[] args){
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1,"A");
        map1.put(2,"B");
        map1.put(3,"C");

        Map<Integer, String> map2 = new HashMap<>();
        map2.put(1,"F");
        map2.put(2,"T");
        map2.put(3,"H");

        map2.forEach((key, value) -> map1.merge(key, value, (v1, v2) -> v1.equalsIgnoreCase(v2) ? v1: v1 + " " + v2));

        System.out.println(map1);

    }
}
