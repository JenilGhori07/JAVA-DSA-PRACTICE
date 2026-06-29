// Singly Linked List:
// A Singly Linked List is a collection of nodes where each node
// contains data and a reference to the next node.

public class SinglyLinkedList {

    Node Head;
    private int Size;

    // Initialize Linked List
    SinglyLinkedList() {
        this.Size = 0;
    }

    // Node structure
    class Node {

        String Data;
        Node Next;

        Node(String Data) {
            this.Data = Data;
            this.Next = null;
            Size++;
        }
    }

    // Add a node at the beginning
    public void AddFirst(String Data) {

        Node NewNode = new Node(Data);

        if (Head == null) {
            Head = NewNode;
            return;
        }

        NewNode.Next = Head;
        Head = NewNode;
    }

    // Add a node at the end
    public void AddLast(String Data) {

        Node NewNode = new Node(Data);

        if (Head == null) {
            Head = NewNode;
            return;
        }

        Node Current = Head;

        while (Current.Next != null) {
            Current = Current.Next;
        }

        Current.Next = NewNode;
    }

    // Print all nodes
    public void Print() {

        if (Head == null) {
            System.out.println("List is Empty!");
            return;
        }

        Node Current = Head;

        while (Current != null) {
            System.out.print(Current.Data + "->");
            Current = Current.Next;
        }

        System.out.println("NULL");
    }

    // Delete the first node
    public void DeleteFirst() {

        if (Head == null) {
            System.out.println("List is empty!");
            return;
        }

        Size--;
        Head = Head.Next;
    }

    // Delete the last node
    public void DeleteLast() {

        if (Head == null) {
            System.out.println("List is empty!");
            return;
        }

        Size--;

        if (Head.Next == null) {
            Head = null;
            return;
        }

        Node SecondLast = Head;
        Node LastNode = Head.Next;

        while (LastNode.Next != null) {
            LastNode = LastNode.Next;
            SecondLast = SecondLast.Next;
        }

        SecondLast.Next = null;
    }

    // Return the size of the Linked List
    public int GetSize() {
        return Size;
    }

    public static void main(String[] args) {

        // Create Linked List
        SinglyLinkedList List = new SinglyLinkedList();

        // Add nodes
        List.AddFirst("A");
        List.AddFirst("Is");
        List.Print();

        List.AddLast("List");
        List.Print();

        List.AddFirst("This");
        List.Print();

        // Delete first node
        List.DeleteFirst();
        List.Print();

        // Delete last node
        List.DeleteLast();
        List.Print();

        // Print size
        System.out.println(List.GetSize());

        List.AddFirst("This");
        List.Print();

        System.out.println(List.GetSize());
    }
}