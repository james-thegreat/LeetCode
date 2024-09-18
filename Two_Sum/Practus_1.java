package LeetCode.Two_Sum;

import java.util.HashMap;

public class Practus_1 {
    public int[] practus_1(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Iterate throgh the array
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int complement = target - num;

            // Cheacks if the complements is presint in the array
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            // add the number and the index to the hashmap
            map.put(num, i);
        }

        throw new IllegalArgumentException("No Two sum exeption.");
    }
}