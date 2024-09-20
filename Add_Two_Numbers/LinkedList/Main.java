package LeetCode.Add_Two_Numbers.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Add elements to the list
        list.add(1);
        list.add(2);
        list.add(3);

        // Print the list
        System.out.println("Initial list: ");
        list.printList();

        // Check if the list contains a value
        System.out.println("List contains 2: " + list.contains(2));

        // Remove an element
        list.Remove((2));
        System.out.println("List after removing 2: ");
        list.printList();

        // Get the size of the list
        System.out.println("Size of the list: " + list.size());
    }
}
