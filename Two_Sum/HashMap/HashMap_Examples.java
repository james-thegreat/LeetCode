package LeetCode.Two_Sum.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Examples {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        // put enters a new key and values into the hash map
        map.put("apple", 10);
        map.put("banana", 20);

        // Removes function
        map.remove("apple"); // Removes the entry with the key "apple "

        // Remove the maped entry if the value is 20
        map.remove("banana", 20);

        // get(Object key) returns the value to were the key is maped
        Integer value = map.get("banana"); // Returns 20

        // containsKey(Object key) Returns true if the map contains a mapping for the
        // specified key
        boolean hasApple = map.containsKey("apple");

        // containsValue(Object value) Returns true if the map maps one or more keys to
        // the specified value
        boolean hasValue20 = map.containsValue(20);

        // Using entrySet() Iterates over key-value pairs
        for (Map.Entry<String, Interger> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Using KeySet() Iterats over keys
        for (String key : map.keySet()) {
            System.out.println(key);
        }

        // Using values() Iterates over values
        for (Integer value : map.values()) {
            System.out.println(value);
        }

        // size() Returns the number of key-value mappong in the map
        int size = map.size();

        // isEmpty() Returns true if the map contains no key-value mappings
        boolean isEmpty = map.isEmpty();

        // clear() Removes all of the mappings from the map
        map.clear(); // clears all enries

        // putIfAbsent(k key, V value) Associes the specified value with-
        // the specifief key if the key is not already associsted with the value
        map.putIfAbsent("banana", 30);

        // comput(k key, BiFunction<? super K,? super V,? extends V> remappingFunction)-
        // Computes a new mapping for the specified key
        map.compute("banana", (k, v) -> (v == null) ? 1 : v + 1); // Increments the value for "banana"

        // merge(K key, Value, BigFunction<? super V,? super V,? extends V>
        // remappingFunction)-
        // Merges the specified value with the existion value for the specified key
        map.merge("banana", 5, Integer::sum); // Adds 5 to the existing value for "banana"

    }
}
