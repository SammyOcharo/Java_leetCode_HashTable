package com.samdev.JavaLeetCodeHashMap;

import java.util.HashMap;
import java.util.Map;

public class BiFunctionHashMap {
    //Compute method in HashMap takes in a key and a BiFunction. The BiFunction contains key and Value pair which can be used to update
    //values in the HashMap

    public static void main(String[] args){
        Map<String, Integer> exampleMap = new HashMap<>();
        exampleMap.put("1",1);
        exampleMap.put("2",4);
        exampleMap.put("3",null);

        System.out.println(exampleMap);

        exampleMap.compute("1", (key, val) -> (val==null) ? 1: val+1);
        System.out.println(exampleMap);

        try{
            exampleMap.compute("3", (key, val) -> (val==null) ? 1: val+1);
            System.out.println(exampleMap);

            exampleMap.compute(null, (key, val) ->  val+1);
            System.out.println(exampleMap);
        }catch(NullPointerException e){
            System.out.println("Exception: " + e);
        }

    }
}
