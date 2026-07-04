// Singly Linked List:
// A Singly Linked List is a collection of nodes where each node
// stores data and a reference to the next node.

public class LinkedListOperations {

    Node head;
    private int size;

    // Initialize Linked List
    LinkedListOperations() {
        this.size = 0;
    }

    // Node structure
    class Node {

        Integer Data;
        Node next;

        Node(Integer Data) {
            this.Data = Data;
            this.next = null;
            size++;
        }
    }

    // Add a node at the beginning
    public void addFirst(Integer Data) {

        Node newNode = new Node(Data);

        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // Add a node at the end
    public void addLast(Integer Data) {

        Node newNode = new Node(Data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;

        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    // Print the linked list
    public void print() {

        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        Node currNode = head;

        while (currNode != null) {
            System.out.print(currNode.Data + " -> ");
            currNode = currNode.next;
        }

        System.out.println("NULL");
    }

    // Delete the first node
    public void DeleteFirst() {

        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        size--;
        head = head.next;
    }

    // Delete the last node
    public void DeleteLast() {

        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        size--;

        // If only one node exists
        if (head.next == null) {
            head = null;
            return;
        }

        Node SecondLast = head;
        Node LastNode = head.next;

        // Find the last and second-last nodes
        while (LastNode.next != null) {
            LastNode = LastNode.next;
            SecondLast = SecondLast.next;
        }

        // Remove the last node
        SecondLast.next = null;
    }

    // Return the size of the linked list
    public int Getsize() {
        return size;
    }

    public static void main(String[] args) {

        // Create a linked list
        LinkedListOperations list = new LinkedListOperations();

        // Add nodes at the beginning
        list.addFirst(2);
        list.addFirst(1);
        list.print();

        // Add nodes at the end
        list.addLast(3);
        list.addLast(4);
        list.print();

        // Delete the first node
        list.DeleteFirst();
        list.print();

        // Delete the last node
        list.DeleteLast();
        list.print();

        // Print the size of the linked list
        System.out.println("Size:" + list.Getsize());
    }
}