package day36;

import java.util.*;

public class day36 {
    public static void main(String[] args) {
        HashMap<String , Integer> map = new HashMap<>();

        //insertion
            //new key
            map.put("India", 100);
            map.put("China", 150);
            map.put("US", 50);

            System.out.println(map);
            //Key already existing 
            map.put("China", 180);//updates the value
            System.out.println(map);

        // Searching 
        System.out.println(map.containsKey("India")); // returns true or false
        System.out.println(map.get("Inia"));//if key present returns value else returns null

        //Iteration

        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
            System.out.println(e);
        }

        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key +"="+ map.get(key));
        }

        //deletation
        map.remove("China");
        System.out.println(map);
    }
    
    
}
