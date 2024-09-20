package LeetCode.Add_Two_Numbers.LinkedList;

public class LinkedList {

    private List_Node head;

    // Add a node at the end of the list
    // Time Complexity: O(n), where n is th number of nodes in the list
    public void add(int value) {
        List_Node newNode = new List_Node(value);
        if (head == null) {
            head = newNode;
        } else {
            List_Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Remove a node with a specific value
    // Time Complexity: O(n), where n id the number of nodes in the list
    public boolean Remove(int value) {
        if (head == null) {
            return false;
        }

        if (head.val == value) {
            head = head.next;
            return true;
        }

        List_Node current = head;
        while (current.next == null) {
            current = current.next;
        }

        if (current.next == null) {
            return false;
        }

        current.next = current.next.next;
        return true;
    }

    // Print all nodes in teh list
    // Time Complexity: O(n), where n is the number of nodes in the list
    public void printList() {
        List_Node current = head;
        while (current != null) {
            System.out.println(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Find a node with a specific value
    // Time Complexity: O(n), where n is the number of nodes in the list
    public boolean contains(int value) {
        List_Node current = head;
        while (current != null) {
            if (current.val == value) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Get the size of the list
    // Time Complexity: O(n), where n is the number of nodes in the list
    public int size() {
        int count = 0;
        List_Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
}
