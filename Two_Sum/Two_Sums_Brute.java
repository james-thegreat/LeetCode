package LeetCode.Two_Sum;

/**
 * Two_Sums
 */

// Time complexity of O(n^2)
public class Two_Sums_Brute {
    public static void main(String[] args) {

        int nums[] = { 2, 7, 11, 15 };
        int two_sum = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] < 9) {

                two_sum += nums[i];

            }

        }
        System.out.println(two_sum);

    }
}

/*
 * Given an array of integers nums and an integer target,
 * return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may
 * not use the same element twice.
 * You can return the answer in any order.
 */