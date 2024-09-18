package LeetCode.Two_Sum;

public class Practus_1_Test {
    public static void main(String[] args) {
        Practus_1 solution = new Practus_1();

        // Test Case 1
        int[] nums1 = { 2, 7, 11, 15 };
        int target1 = 9;
        int[] result1 = solution.practus_1(nums1, target1);
        System.out.println("Test Case 1: " + (result1[0] == 0 && result1[1] == 1 ? "Passed" : "Failed"));

        // Test Case 2
        int[] nums2 = { 3, 2, 4 };
        int target2 = 6;
        int[] result2 = solution.practus_1(nums2, target2);
        System.out.println("Test Case 2: " + (result2[0] == 1 && result2[1] == 2 ? "Passed" : "Failed"));

        // Test Case 3
        int[] nums3 = { 3, 3 };
        int target3 = 6;
        int[] result3 = solution.practus_1(nums3, target3);
        System.out.println("Test Case 3: " + (result3[0] == 0 && result3[1] == 1 ? "Passed" : "Failed"));
    }
}
