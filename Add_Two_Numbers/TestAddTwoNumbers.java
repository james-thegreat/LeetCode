package LeetCode.Add_Two_Numbers;

public class TestAddTwoNumbers {

    public static void main(String[] args) {
        AddTwoNumbers solution = new AddTwoNumbers();

        // Test Case 1
        ListNode l1_1 = createList(new int[] { 2, 4, 3 });
        ListNode l2_1 = createList(new int[] { 5, 6, 4 });
        ListNode result1 = solution.addTwoNumbers(l1_1, l2_1);
        System.out.println("Test Case 1: " + listToString(result1)); // Output: [7, 0, 8]

        // Test Case 2
        ListNode l1_2 = createList(new int[] { 0 });
        ListNode l2_2 = createList(new int[] { 0 });
        ListNode result2 = solution.addTwoNumbers(l1_2, l2_2);
        System.out.println("Test Case 2: " + listToString(result2)); // Output: [0]

        // Test Case 3
        ListNode l1_3 = createList(new int[] { 9, 9, 9, 9, 9, 9, 9 });
        ListNode l2_3 = createList(new int[] { 9, 9, 9, 9 });
        ListNode result3 = solution.addTwoNumbers(l1_3, l2_3);
        System.out.println("Test Case 3: " + listToString(result3)); // Output: [8, 9, 9, 9, 0, 0, 0, 1]
    }

    private static ListNode createList(int[] values) {
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        for (int value : values) {
            current.next = new ListNode(value);
            current = current.next;
        }
        return dummyHead.next;
    }

    private static String listToString(ListNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        while (node != null) {
            sb.append(node.val);
            if (node.next != null) {
                sb.append(", ");
            }
            node = node.next;
        }
        sb.append("]");
        return sb.toString();
    }
}