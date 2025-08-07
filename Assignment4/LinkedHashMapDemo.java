package Assignment4;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {

        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        //  Add key-value pairs
        System.out.println(" Insertion:");
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Orange", 3);
        System.out.println("After insertion: " + map);

        // 2. Deletion: Remove a key-value pair
        System.out.println("\n Deletion:");
        map.remove("Banana");
        System.out.println("After removing 'Banana': " + map);

        // Add an entry at the beginning
        System.out.println("\n Insert at Start:");
        map.putFirst("Mango", 0); // SequencedMap method
        System.out.println("After inserting 'Mango' at start: " + map);

        //  Add an entry at the end
        System.out.println("\n Insert at End:");
        map.putLast("Grape", 4); // SequencedMap method
        System.out.println("After inserting 'Grape' at end: " + map);

        //Iterate in reverse order
        System.out.println("\n Reversed Iteration:");
        for (Map.Entry<String, Integer> entry : map.reversed().entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("\n Insertion order iteration");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }



        System.out.println("First Entry: " + map.firstEntry());
        System.out.println("Last Entry: " + map.lastEntry());
    }
}