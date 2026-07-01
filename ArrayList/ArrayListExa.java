// ArrayList:
// ArrayList is a dynamic array in Java that can grow or shrink in size.
// It is used to store multiple elements of the same data type.

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExa {

    public static void main(String[] args) {

        // Create an ArrayList of Integer type
        ArrayList<Integer> List = new ArrayList<>();

        // ArrayList<String> List1 = new ArrayList<>();
        // ArrayList<Boolean> List2 = new ArrayList<>();

        // Add elements to the ArrayList
        List.add(0);
        List.add(5);

        System.out.println(List);

        // Get an element using its index
        int Ele = List.get(0);
        System.out.println(Ele);

        // Insert an element at a specific index
        List.add(1, 4);
        System.out.println(List);

        // Update an element at a specific index
        List.set(0, 1);
        System.out.println(List);

        // Remove an element using its index
        List.remove(0);
        System.out.println(List);

        // Find the size of the ArrayList
        int size = List.size();
        System.out.println(size);

        // Traverse the ArrayList using a loop
        for (int i = 0; i < List.size(); i++) {
            System.out.print(List.get(i) + " ");
        }
        System.out.println();

        // Sort the ArrayList in ascending order
        Collections.sort(List);
        System.out.println(List);
    }
}
