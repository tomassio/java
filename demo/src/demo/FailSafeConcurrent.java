package demo;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeConcurrent {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        // Create an iterator
        Iterator<Integer> iterator = map.keySet().iterator();

        while (iterator.hasNext()) {
            Integer key = iterator.next();


            // Simulate concurrent modification (no exception thrown)
            if (key == 2) {
                map.put(4, "Four");
            }
            if (key == 3) {
            	map.put(6, "Six");
            }            
            System.out.println(key);            
        }
    }
}