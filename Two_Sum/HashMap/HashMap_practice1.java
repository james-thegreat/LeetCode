package LeetCode.Two_Sum.HashMap;

import java.util.HashMap;
import java.util.Map;

// Practusing Printing Out a HashMap
public class HashMap_practice1 {
    public static void main(String[] args) {

        // Creates a hash map to store keys and values into map
        HashMap<Integer, Integer> map = new HashMap<>();

        // Put Adds created a new entry with a Key and a Value
        map.put(1, 205);
        map.put(2, 300);
        map.put(3, 307);
        map.put(4, 103);
        map.put(5, 507);

        // Iterate over the entrys and print
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

    }

}
