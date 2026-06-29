// LinkedList:
// LinkedList is a linear data structure where elements are stored as nodes.
// Each node contains data and a reference to the next node.

import java.util.*;

class LinkedListDemo {

    public static void main(String[] args) {

        // Create a LinkedList of String type
        LinkedList<String> List = new LinkedList<String>();

        // Add elements at the beginning
        List.addFirst("a");
        List.addFirst("is");
        List.addFirst("This");
        System.out.println(List);

        // Add element at the end
        List.addLast("List");
        System.out.println(List);

        // Print the size of the LinkedList
        System.out.println(List.size());

        // Traverse the LinkedList
        for (int i = 0; i < List.size(); i++) {
            System.out.print(List.get(i) + "->");
        }
        System.out.println("NULL");

        // Remove the first element
        List.removeFirst();
        System.out.println(List);

        // Remove the last element
        List.removeLast();
        System.out.println(List);

        // Remove element at index 1
        List.remove(1);
        System.out.println(List);
    }
}