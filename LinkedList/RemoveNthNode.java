// Remove Nth Node From End:
// Delete the Nth node from the end of a singly linked list.

public class RemoveNthNode {

    // Node structure
    static class ListNode {

        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    // Remove the Nth node from the end
    public static ListNode removeNthFromEnd(ListNode head, int n) {

        // If the list contains only one node
        if (head.next == null) {
            return null;
        }

        int size = 0;
        ListNode curr = head;

        // Count the total number of nodes
        while (curr != null) {
            curr = curr.next;
            size++;
        }

        // If the first node needs to be removed
        if (n == size) {
            return head.next;
        }

        // Find the node before the target node
        int indexToSearch = size - n;
        ListNode prev = head;
        int i = 1;

        while (i < indexToSearch) {
            prev = prev.next;
            i++;
        }

        // Delete the target node
        prev.next = prev.next.next;

        return head;
    }

    // Print the linked list
    public static void printList(ListNode head) {

        ListNode curr = head;

        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }

        System.out.println("NULL");
    }

    public static void main(String[] args) {

        // Create the linked list
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Print original list
        System.out.println("Original List:");
        printList(head);

        // Remove the 2nd node from the end
        head = removeNthFromEnd(head, 2);

        // Print updated list
        System.out.println("After Removing 2nd Node From End:");
        printList(head);
    }
}