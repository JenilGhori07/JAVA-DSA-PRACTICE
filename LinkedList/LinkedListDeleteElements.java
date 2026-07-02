// LinkedList Delete Elements:
// Create a LinkedList, take elements as input, and delete
// all elements whose value is greater than 25.

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListDeleteElements {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create a LinkedList of Integer type
        LinkedList<Integer> list = new LinkedList<>();

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements (1-50):");

        // Take input from the user
        for (int i = 0; i < n; i++) {

            int num = sc.nextInt();

            // Accept only numbers between 1 and 50
            if (num >= 1 && num <= 50) {
                list.add(num);
            } else {
                System.out.println("Invalid input! Enter numbers between 1 and 50.");
                i--; // Repeat the same iteration
            }
        }

        // Display the original LinkedList
        System.out.println("Original Linked List: " + list);

        // Remove all elements greater than 25
        list.removeIf(num -> num > 25);

        // Display the updated LinkedList
        System.out.println("Linked List after deleting elements greater than 25:");
        System.out.println(list);

        sc.close();
    }
}